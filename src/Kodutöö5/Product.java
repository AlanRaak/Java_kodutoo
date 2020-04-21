package Kodutöö5;

public class Product {
    private int index;
    private String name;
    private int quantity;
    private double price;
    private Vendor vendor;

    public Product(int index, String name, int quantity, double price) {
        this.index = index;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", inventory value=" + inventoryValue() +
                ", vendor=" + ((vendor != null) ? vendor.getName() : "not assigned");
    }

    public String toString(String add_fee) {
        return "Product{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", inventory value=" + inventoryValue()*1.05 +
                ", vendor=" + ((vendor != null) ? vendor.getName() : "not assigned");
    }

    public double inventoryValue(){
        return quantity*price;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
