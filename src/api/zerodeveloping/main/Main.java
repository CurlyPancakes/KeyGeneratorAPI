package api.zerodeveloping.main;

import api.zerodeveloping.KeyGenerator;
import api.zerodeveloping.KeyPattern;
import api.zerodeveloping.KeyScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KeyGenerator keyGenerator = new KeyGenerator();
        keyGenerator.setPattern(KeyPattern.getDefault());
        keyGenerator.generate();

        KeyScanner keyScanner = new KeyScanner();
        keyScanner.setPattern(KeyPattern.getDefault());
        Scanner scanner = new Scanner(System.in);
        if(keyScanner.isValid(scanner.nextLine())){
            System.out.println("Key Valid");
        }else{
            System.out.println("Key Invalid");
        }
    }
}
