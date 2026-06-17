## LEVEL 1 EXCEPTIONS
This Java application simulates a basic sales system. The goal is to create and use a custom exception and understand 
the difference between checked and unchecked exceptions. 

### STRUCTURE
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

### TESTING
First a `sale01` object is created and the products are added to the list.
Second, an attempt is made to access an invalid list position: 
System.out.println(sale01.getProducts().get(5));
Output: Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 4 ...

After adding a try catch block with `IndexOutOfBoundsException`, the code continues executing. 
Output: Error: Index 5 out of bounds for length 4 
and the program continues running.

Then the total price is calculated. 
`sale01.calculateTotal()` 
Output: Total: 8.83 euros.

To test and empty Sale, `sale02` is created without adding any products, and `EmptySaleException` extends `Exception`.
Without a try catch block the program don't compile.
Output: java: unreported exception level01.EmptySaleException; must be caught or declared to be thrown.

With the try and catch block the program continue and displays: 
Error: You must first add product to make a sale.

EmptySaleException is then modified to extend RunTimeException. When a third Sale `(sale03)` is created empty, and 
`calculateTotal()` method is called, without a try catch block, the program executes normally until it reaches that line
the excepcion is not hangled, As a result, the program ends.

### CONCLUSIONS
The `IndexOutOfBoundsException` is a standar Java exception and when it's caught it displays an error message when tying
to access a non existent index in the product list.
When `EmptySaleException` extends `Exception` it becomes a checked exception so the compiler foces the use of a try/catch
block or a throws declaration before the program can compile.
But, when it extends `RuntimeExcepcion` it becomes an unchecked exception. The program compiles and runs normally, but 
it crashes at runtime when the `calculateTotal()` method is called on an empty sale.







