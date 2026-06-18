package level02;

public class OneCharacterException extends Exception {
    public OneCharacterException() {
        super("Enter a single character. Try again.");
    }
}
