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

        Sale sale02 = new Sale();
        Sale sale03 = new Sale();


        try {
            System.out.println(sale01.getProducts().get(5));
        } catch (IndexOutOfBoundsException error){
            System.out.println("Error: " + error.getMessage());
        }

        totalSale(sale01);
        totalSale(sale02);

        sale03.calculateTotal();
    }

    private static void totalSale (Sale currentSale) {
        try {
            currentSale.calculateTotal();
            System.out.println("Total: " + currentSale.getTotalPrice() + " euros.");
        } catch (EmptySaleException error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
