package level01;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale(){
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct (Product p){
        products.add(p);
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotal() {
        if (products.isEmpty()){
            throw new EmptySaleException("can't calculate total price");
        }
        double total= 0;
        for (Product product : products) {
            total = total + product.getPrice();
        }
        this.totalPrice=total;
    }
}
