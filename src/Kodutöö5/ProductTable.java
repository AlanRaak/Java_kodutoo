package Kodutöö5;

public class ProductTable extends Product {

    private int table_legs;

    public ProductTable(int index, String name, int quantity, double price, int table_legs) {
        super(index, name, quantity, price);
        this.table_legs = table_legs;
    }

    public String toString() {
        return "ProductTable{" +
                "index=" + getIndex() +
                ", name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + getPrice() +
                ", inventory value(wih fee)=" + inventoryValue() +
                ", vendor=" + ((getVendor() != null) ? getVendor().getName() : "not assigned");
    }

    @Override
    public double inventoryValue(){
        return getQuantity()*getPrice()*1.05;
    }

    public void setTable_legs(int table_legs) {
        this.table_legs = table_legs;
    }

    public int getTable_legs() {
        return table_legs;
    }
}

