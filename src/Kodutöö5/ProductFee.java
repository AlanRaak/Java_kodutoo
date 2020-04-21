package Kodutöö5;

public class ProductFee extends Product {
    public ProductFee(int index, String name, int quantity, double price) {
        super(index, name, quantity, price);
    }

    @Override
    public double inventoryValue(){
        return getQuantity()*getPrice()*1.05;
    }
}
