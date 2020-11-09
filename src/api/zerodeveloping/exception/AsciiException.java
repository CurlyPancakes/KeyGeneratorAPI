package api.zerodeveloping.exception;

public class AsciiException extends Exception {
    public AsciiException(int max_ascii_code, int current_ascii_code){
        super("Your selected ascii code is to high! Max:"+max_ascii_code+" | Current:"+current_ascii_code+" | Recommended around:"+max_ascii_code*0.7);
    }
}
