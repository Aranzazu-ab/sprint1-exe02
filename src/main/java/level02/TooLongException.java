package level02;

public class TooLongException extends Exception {
    public TooLongException (String message) {
        super ("Too many characters."+ message);
    }
}
