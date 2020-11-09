package examples;

import api.zerodeveloping.KeyPattern;
import api.zerodeveloping.KeyScanner;

import java.util.Scanner;

public class ScanKey {
    //A simple test method to scan a key
    public static void main(String[] args) {
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
