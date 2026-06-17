package level02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static Scanner scan = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                byte value = scan.nextByte();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Try again.");
                scan.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                int value = scan.nextInt();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Try again.");
                scan.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                float value = scan.nextFloat();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Try again.");
                scan.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                double value = scan.nextDouble();
                return value;
            } catch (InputMismatchException error) {
                System.out.println("Format error. Try again.");
                scan.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String value = scan.nextLine();
                if (value.length() != 1) {
                    throw new OneCharacterException();
                } else {
                    return value.charAt(0);
                }
            } catch (OneCharacterException error) {
                System.out.println(error.getMessage());
            }
        }
    }

    public static String readString(String message){
        while (true) {
            try {
                System.out.println(message);
                String value = scan.nextLine();
                if (value.length() > 10) {
                    throw new TooLongException();
                } else {
                    return;
                }
            } catch (TooLongException error) {
                System.out.println(error.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message){
        while (true) {
            try {
                System.out.println(message);
                String value = scan.nextLine().toLowerCase();
                if (value.equals("y")){
                    return true;
                } if (value.equals("n")){
                    return false;
                } else {
                    throw new YesNoException();
                }
            } catch (YesNoException error){
                System.out.println(error.getMessage());
            }
        }
    }
}
