package level02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner SCAN = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                byte value = SCAN.nextByte();
                SCAN.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Enter a valid number (byte) Try again.");
                SCAN.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                int value = SCAN.nextInt();
                SCAN.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Enter a valid integer number. Try again.");
                SCAN.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                float value = SCAN.nextFloat();
                SCAN.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Enter a valid decimal number. Try again.");
                SCAN.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                double value = SCAN.nextDouble();
                SCAN.nextLine();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Enter a double number. Try again.");
                SCAN.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String value = SCAN.nextLine();
                if (value.length() != 1) {
                    throw new OneCharacterException(" Try again.");
                } else {
                    return value.charAt(0);
                }
            } catch (OneCharacterException error) {
                System.out.println("Invalid input. " +error.getMessage());
            }
        }
    }

    public static String readString(String message){
        while (true) {
            try {
                System.out.println(message);
                String value = SCAN.nextLine();
                if (value.length() > 10) {
                    throw new TooLongException(" Lenght most be 10 characters. Try again.");
                } else {
                    return value;
                }
            } catch (TooLongException error) {
                System.out.println("Format error. "+error.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message){
        while (true) {
            try {
                System.out.println(message);
                String value = SCAN.nextLine().toLowerCase();
                if (value.equals("y")){
                    return true;
                } if (value.equals("n")){
                    return false;
                } else {
                    throw new YesNoException(" Enter 'y' for yes or 'n' for no. Try again.");
                }
            } catch (YesNoException error){
                System.out.println("Invalid input. "+error.getMessage());
            }
        }
    }
}
