package level02;

public class TooLongException extends Exception {
    public TooLongException () {
        super ("Maximum 10 characters allowed. Try again.");
    }
}
