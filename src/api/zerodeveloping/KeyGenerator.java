package api.zerodeveloping;

import api.zerodeveloping.exception.AsciiException;

public class KeyGenerator {
    KeyPattern pattern;

    public void setPattern(KeyPattern pattern) {
        this.pattern = pattern;
    }

    public String generate() {
        String[] sections = pattern.getKey_pattern().split("-");

        int security_numbers = (int) (Math.ceil(sections.length / 2.0));
        int maxAscii = 0;
        int ascii_multiplier = 0;

        for (String section : sections) {
            maxAscii += section.length();
            for(int i = 0; i < section.length(); i++){
                int ascii_char = (int) section.charAt(i);
                if(ascii_char > ascii_multiplier) ascii_multiplier = ascii_char;
            }
        }
        maxAscii *= ascii_multiplier;
        try{if(pattern.getAscii_count() > maxAscii) throw new AsciiException(maxAscii, pattern.getAscii_count());}catch (AsciiException e){e.printStackTrace();}

        String key = "";
        while(true) {
            int char_counter = 0;
            int counter = 0;
            for (String section : sections) {
                counter++;
                for(int i = 0; i < section.length(); i++) key += pattern.getAlphabet_pattern().charAt((int) Math.round(Math.random() * (pattern.getAlphabet_pattern().length() - 1)));

                if(counter != sections.length) key += "-";
            }
            counter = 0;

            for(int i = 0; i < key.length(); i++) if(key.charAt(i) == pattern.getControl_number()) char_counter++;

            if(security_numbers <= char_counter) {
                int ascii_count = 0;
                for(int i = 0; i < key.length(); i++) {
                    if(key.charAt(i) != '-') ascii_count += (int) key.charAt(i);
                }
                if(ascii_count == pattern.getAscii_count()) {
                    return key;
                }
            }
            key = "";
        }
    }
}
