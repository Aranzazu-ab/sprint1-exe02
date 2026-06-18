package level02;

public class YesNoException extends Exception {
    public YesNoException() {
        super("Enter 'y' for yes or 'n' for no. Try again.");
    }
}
