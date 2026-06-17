package level01;


public class Main {
    public static void main (String[] args){

        Product product01 = new Product("Apples", 2.58);
        Product product02 = new Product("Gazpacho", 3.5);
        Product product03 = new Product("Milk", 1.65);
        Product product04 = new Product("Ice", 1.1);

        Sale sale01 = new Sale();
        sale01.getProducts().add(product01);
        sale01.getProducts().add(product02);
        sale01.getProducts().add(product03);
        sale01.getProducts().add(product04);

        try {
            sale01.calculateTotal();
            System.out.println("Total: " +sale01.getTotalPrice() + " euros.");
        } catch (EmptySaleException error) {
            System.out.println("Error: " + error.getMessage());
        }

        try {
            System.out.println(sale01.getProducts().get(5));
        } catch (IndexOutOfBoundsException error){
            System.out.println("Error: " + error.getMessage());
        }

        Sale sale02 = new Sale();
        try {
            sale02.calculateTotal();
            System.out.println("Total: " +sale01.getTotalPrice() + " euros.");
        } catch (EmptySaleException error) {
            System.out.println("Error: " + error.getMessage());
        }

        Sale sale03 = new Sale();

        sale03.calculateTotal();
    }
}
