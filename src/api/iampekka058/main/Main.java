package api.iampekka058.main;

import api.iampekka058.generate.KeyGenerator;
import api.iampekka058.generate.KeyGeneratorPattern;

public class Main {
    public static void main(String[] args) {
        KeyGenerator keyGenerator = new KeyGenerator();
        keyGenerator.setPattern(KeyGeneratorPattern.getDefault());
        keyGenerator.generate(10);
        //TEST
    }
}
