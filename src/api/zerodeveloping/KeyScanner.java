package api.zerodeveloping;

public class KeyScanner {

    KeyPattern pattern;

    public void setPattern(KeyPattern pattern) {
        this.pattern = pattern;
    }

    public boolean isValid(String key){
        String[] sections_pattern = pattern.getKey_pattern().split("-");
        String[] sections_key = key.split("-");

        int char_counter = 0;
        int ascii_count = 0;
        int security_numbers = (int) (Math.ceil(sections_pattern.length / 2.0));

        if(sections_pattern.length != sections_key.length) return false;
        for(int i = 0; i < sections_pattern.length; i++){
            if(sections_pattern[i].length() != sections_key[i].length()) return false;
        }
        for(int i = 0; i < key.length(); i++) {
            if(key.charAt(i) == pattern.getControl_number()) {
                char_counter++;
            }
        }
        if(char_counter < security_numbers) return false;
        for(int i = 0; i < key.length(); i++) {
            if(key.charAt(i) != '-') {
                ascii_count += (int) key.charAt(i);
            }
        }
        if(ascii_count==pattern.getAscii_count()) return true;

        return false;
    }
}
