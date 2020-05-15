package Kodutöö7;

import java.util.Objects;

public class Product {

    private String name;
    private int size;

    public Product(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name + size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return size == product.getSize() &&
                name.equals(product.getName());
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
