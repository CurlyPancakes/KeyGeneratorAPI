package examples;

import api.zerodeveloping.KeyGenerator;
import api.zerodeveloping.KeyPattern;
import api.zerodeveloping.KeyScanner;

import java.util.Scanner;

public class CreateKey {
    //A simple test method to create a key
    public static void main(String[] args) {
        KeyGenerator keyGenerator = new KeyGenerator();
        keyGenerator.setPattern(KeyPattern.getDefault());

        String key = keyGenerator.generate();
        System.out.println(key);
    }
}
