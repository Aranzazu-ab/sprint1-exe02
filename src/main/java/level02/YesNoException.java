package level02;

public class YesNoException extends Exception {
    public YesNoException(String message) {
        super("Only a yes or no is accepted. "+ message);
    }
}
