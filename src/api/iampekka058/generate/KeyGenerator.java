package api.iampekka058.generate;

import java.util.Scanner;

public class KeyGenerator {
    KeyGeneratorPattern pattern;

    public void setPattern(KeyGeneratorPattern pattern) {
        this.pattern = pattern;
    }

    public void generate(int count){
        int length = 0;
        int chunk_length = 0;
        int seperators = 0;
        Scanner scanner = new Scanner(pattern.getKey_pattern());
        while(scanner.hasNext()){
            String act_char = scanner.next();

            if(!act_char.equals("-")){
                length++;
                chunk_length++;
            }else{
                seperators++;
            }
        }
        System.out.println(chunk_length);
    }
}
