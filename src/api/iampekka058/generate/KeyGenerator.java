package api.iampekka058.generate;

public class KeyGenerator {
    KeyGeneratorPattern pattern;

    public void setPattern(KeyGeneratorPattern pattern) {
        this.pattern = pattern;
    }

    public void generate() {
        String[] sections = pattern.getKey_pattern().split("-");

        int security_numbers = (int) (Math.ceil(sections.length / 2.0));
        int maxAscii = 0;
        for (String section : sections) {
            maxAscii += section.length();
        }
        maxAscii *= 125;
        maxAscii *= 0.8;

        System.out.println(maxAscii);

        String key = "";
        while(true) {
            int char_counter = 0;
            int counter = 0;
            for (String section : sections) {
                counter++;
                for(int i = 0; i < section.length(); i++) {
                    key += pattern.getAlphabet_pattern().charAt((int) Math.round(Math.random() * (pattern.getAlphabet_pattern().length() - 1)));
                }
                if(counter != 5)
                    key += "-";
            }
            counter = 0;

            for(int i = 0; i < key.length(); i++) {
                if(key.charAt(i) == pattern.getControl_number()) {
                    char_counter++;
                }
            }

            if(security_numbers == char_counter) {
                int ascii_count = 0;
                for(int i = 0; i < key.length(); i++) {
                    if(key.charAt(i) != '-') {
                        ascii_count += (int) key.charAt(i);
                    }
                }
                if(ascii_count == pattern.getAscii_count()) {
                    System.exit(0);
                } else {
                    System.out.println(ascii_count);
                }
            } else {
                System.out.println(char_counter);
            }
            System.out.println(key);

            key = "";
        }
    }
}
