package api.iampekka058.generate;

public class KeyGeneratorPattern {
    private String key_pattern;
    private int control_number;
    private int number_sum;
    private String alphabet_pattern;

    public KeyGeneratorPattern(String key_pattern, int control_number, int number_sum, String alphabet_pattern){
        this.key_pattern = key_pattern;
        this.control_number = control_number;
        this.number_sum = number_sum;
        this.alphabet_pattern = alphabet_pattern;
    }

    public static KeyGeneratorPattern getDefault(){
        return new KeyGeneratorPattern("aaaa-aaaa-aaaa-aaaa-1111",7, 1973, "abcdefghijklmnopqrstufwxyz1234567890");
    }

    public String getKey_pattern() {
        return key_pattern;
    }

    public String getAlphabet_pattern() {
        return alphabet_pattern;
    }

    public int getControl_number() {
        return control_number;
    }

}
