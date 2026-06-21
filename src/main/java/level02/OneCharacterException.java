package level02;

public class OneCharacterException extends Exception {
    public OneCharacterException(String message) {
        super("Only one character is accepted. "+ message);
    }
}
