package level01;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException (){
        super("You must first add product to make a sale.");
    }
}
