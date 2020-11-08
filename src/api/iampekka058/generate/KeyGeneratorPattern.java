package api.iampekka058.generate;

public class KeyGeneratorPattern {
    private String key_pattern;
    private char control_number;
    private int ascii_count;
    private String alphabet_pattern;

    public KeyGeneratorPattern(String key_pattern, char control_number, int ascii_count, String alphabet_pattern){
        this.key_pattern = key_pattern;
        this.control_number = control_number;
        this.ascii_count = ascii_count;
        this.alphabet_pattern = alphabet_pattern;
    }

    public static KeyGeneratorPattern getDefault(){
        return new KeyGeneratorPattern("aaaa-aaaa-aaaa-aaaa-1111",'7', 1507, "abcdefghijklmnopqrstufwxyz1234567890");
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
}
