# LEVEL 1 EXCEPTIONS
This Java application simulates a basic sales system. The goal is to create and use a custom exception and understand 
the difference between checked and unchecked exceptions. 

## STRUCTURE
```text
level01/
├── Main.java
├── Product.java
├── Sale.java
└── EmptySaleException.java
```
**Product:**
* `name`
* `price`

**Class Sale:**
* products `(ArrayList<Product>)`
* `totalPrice` 
* `calculateTotal()`

**EmptySaleException:**
Custom exception thrown when attempting to calculate the total price of an empty sale list.

**Main:**
Creates products, create a sale, add the products to it, and contains test cases to verify the correct calculation and 
test different exception scenarios.
It handles `IndexOutBoundsException` and uses `EmptySaleException`.
The repeated try/catch logic is encapsulated in a private static method totalSale(Sale currentSale), called once 
for each sale.

## TESTING
First a `sale01` object is created and the products are added to the list.
Second, an attempt is made to access an invalid list position: 
System.out.println(sale01.getProducts().get(5));
Output: Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 4 ...

After adding a try catch block with `IndexOutOfBoundsException`, the code continues executing. 
Output: Error: Index 5 out of bounds for length 4 
and the program continues running.

Then the total price is calculated through the `totalSale(sale01)` method call.
Output: Total: 8.83 euros.

To test and empty Sale, `sale02` is created without adding any products, and `EmptySaleException` extends `Exception`.
Without a try catch block the program don't compile.
Output: java: unreported exception level01.EmptySaleException; must be caught or declared to be thrown.

With the try and catch block inside `totalSale(sale02)`, the program continue and displays: 
Error: You must first add product to make a sale.

EmptySaleException is then modified to extend RunTimeException. When a third Sale `(sale03)` is created empty, and 
`calculateTotal()` method is called, without a try catch block, the program executes normally until it reaches that line
the excepcion is not hangled, as a result, the program ends.

## CONCLUSIONS
The `IndexOutOfBoundsException` is a standar Java exception and when it's caught it displays an error message when tying
to access a non existent index in the product list.
When `EmptySaleException` extends `Exception` it becomes a checked exception so the compiler foces the use of a try/catch
block or a throws declaration before the program can compile.
But, when it extends `RuntimeExcepcion` it becomes an unchecked exception. The program compiles and runs normally, but 
it crashes at runtime when the `calculateTotal()` method is called on an empty sale.

# LEVEL 2 EXCEPTIONS

This Java application provides a utility class to safely read different data types from the console. The goals is to 
handle invalid user input, prevent the application from terminating unexcpected and practice using standard and 
personalized exceptions.

## STRUCTURE
```text
level02/
├── Main.java
├── ConsoleReader.java
├── OneCharacterException.java
├── TooLongException.java
└── YesNoException.java
```

**ConsoleReader:**
* `readByte()`
* `readInt()`
* `readFloat()`
* `readDouble()`
* `readChar()`
* `readString()`
* `readYesNo()`

**OneCharacterException:**
Custom exception thrown when the user enters more than one character.

**TooLongException:**
Custom exception thrown when the entered text exceeds the maximum allowed length.

**YesNoException:**
Custom exception thrown when the user enters a value other than "y" or "n".

**Main:**
Calls all methods from ConsoleReader and contains test cases to verify input validation and exception handling.

## TESTING 

The methods `readByte()`, `readInt()`, `readFloat()`, and `readDouble()` use InputMismatchException to validate numeric 
input. When a value with an incorrect format is entered, an error message is displayed and the user is asked to enter 
the value again.

Console:
Enter your age:
abc
Format error. Enter a valid number (byte) Try again.
Enter your age:
52
Your age: 52

The same behavior occurs for all numeric methods.

The `readChar()` method only accepts a single character. If more than one character is entered, a custom exception is thrown.

Console: 
Enter one character:
45
Invalid input. Only one character is accepted.  Try again.
Enter one character:
*
Your character: *

The `readString()` method validates the maximum length of the text. If more than 10 characters are entered, 
a custom exception is thrown.

Console:
Enter a password:
kfjkldfjgrjrejrggtrg
Format error. Too many characters. Lenght most be 10 characters. Try again.
Enter a password:
ahdkfjsie
Your password: ahdkfjsie

Also, the `readYesNo(`) method only accepts y or n. Any other value causes a custom exception to be thrown.

Console:
Do you like the questions?  
maybe
Invalid input. Only a yes or no is accepted.  Enter 'y' for yes or 'n' for no. Try again.
Do you like the questions?  
n
Your answer: false

## CONCLUSIONS

The `InputMismatchException` is used to validate numeric input and prevent the program from terminating when the user 
enters text or invalid characters instead of numbers.
Also, custom exceptions are used for validations that are not covered by standard Java exceptions, such as 
checking that only one character is entered, limiting the length of a string, or accepting only specific values (y or n).

The use of while(true) loops allows the application to repeatedly request input until a valid value is entered, that is 
why is important that the message is into the loop, that way can improve the user experience and making the program 
more robust.

Using a single static Scanner object by all methods, reduce code duplication and makes the input methods easy to reuse.



