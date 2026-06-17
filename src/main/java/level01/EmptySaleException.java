package level01;

public class EmptySaleException extends Exception {
    public EmptySaleException (){
        super("You must first add product to make a sale.");
    }
}
