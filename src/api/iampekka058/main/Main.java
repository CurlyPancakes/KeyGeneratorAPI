package api.iampekka058.main;

import api.iampekka058.generate.KeyGenerator;
import api.iampekka058.generate.KeyGeneratorPattern;

public class Main {
    public static void main(String[] args) {
        KeyGenerator keyGenerator = new KeyGenerator();
        keyGenerator.setPattern(new KeyGeneratorPattern("aaaa-aaaa-aaaa-aaaa", '8', 1102, "abcdefghijklmnopqrstufwxyz1234567890"));
        keyGenerator.generate();
    }
}
