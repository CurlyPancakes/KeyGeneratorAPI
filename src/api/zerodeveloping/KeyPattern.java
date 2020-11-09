package api.zerodeveloping;

public class KeyPattern {
    private String key_pattern;
    private char control_number;
    private int ascii_count;
    private String alphabet_pattern;
    private String alphabet_lower = "abcdefghijklmnopqrstuvwxyz";
    private String alphabet_higher = "ABCDEFGHIJKLMNOPQRSTUVWXYL";
    private String digits = "0123456789";
    private String punctuation = "§$%&/()=?";

    public KeyPattern(String key_pattern, char control_number, int ascii_count, String alphabet_pattern){
        this.key_pattern = key_pattern;
        this.control_number = control_number;
        this.ascii_count = ascii_count;
        this.alphabet_pattern = alphabet_pattern;
    }

    public static KeyPattern getDefault(){
        return new KeyPattern("aaaa-aaaa-aaaa-aaaa-1111",'7', 50000, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYL0123456789");
    }

    public String getKey_pattern() {
        return key_pattern;
    }

    public String getAlphabet_pattern() {
        return alphabet_pattern;
    }

    public char getControl_number() {
        return control_number;
    }

    public int getAscii_count() {
        return ascii_count;
    }

    public String getAlphabet_higher() {
        return alphabet_higher;
    }

    public String getAlphabet_lower() {
        return alphabet_lower;
    }

    public String getDigits() {
        return digits;
    }

    public String getPunctuation() {
        return punctuation;
    }
}
