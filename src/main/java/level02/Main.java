package level02;

public class Main {
    public static void main (String[] args) {
        byte age = ConsoleReader.readByte("Enter your age: ");
        System.out.println("Your age: " + age);

        int number = ConsoleReader.readInt("Enter you favorite number: ");
        System.out.println("Your favorite number: " + number);

        float weight = ConsoleReader.readFloat("Enter your weight: ");
        System.out.println("Your weight: " + weight);

        double price = ConsoleReader.readDouble("Enter your laptop price: ");
        System.out.println("Your laptop price: " + price);

        char character = ConsoleReader.readChar("Enter one character: ");
        System.out.println("Your character: " + character);

        String password = ConsoleReader.readString("Enter a password: ");
        System.out.println("Your password: "+ password);

        boolean yesNo = ConsoleReader.readYesNo("Do you like the questions?  ");
        System.out.println("Your answer: " + yesNo);
    }
}