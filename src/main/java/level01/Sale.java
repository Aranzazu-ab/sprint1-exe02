package level01;

import java.util.ArrayList;

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

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()){
            throw new EmptySaleException();
        } else {
            for(int i = 0; i< products.size(); ++i){
                totalPrice= totalPrice + products.get(i).getPrice();
            }
        }
    }
}
