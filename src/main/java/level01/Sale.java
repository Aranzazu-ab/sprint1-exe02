package level01;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale(){
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotal() {
        if (products.isEmpty()){
            throw new EmptySaleException("can't calculate total price");
        }
        for (Product product : products) {
            totalPrice = totalPrice + product.getPrice();
        }
    }
}
