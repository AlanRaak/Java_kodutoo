package Kodutöö5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class ProductTester {

    private static Scanner in = new Scanner(System.in);
    private static Hashtable<String, Product> products = new Hashtable<String, Product>();

    private static void addToProducts(Product product, int quantity){
        if (products.containsKey(product.getName())){
            product.setQuantity(product.getQuantity() + quantity);
            products.put(product.getName(), product);
        }else {
            addToProducts(product);
        }
    }

    private static void addToProducts(Product product){
        products.put(product.getName(), product);
    }

    private static Product createNewProduct(){
        System.out.println("Add product ( y / n )?");
        if (in.nextLine().equals("y")){
            int index = 69; // ei kasuta toote numbreid(indekseid), indekseerimine toimub toote nime järgi
            String name;
            int quantity;
            double price;
            System.out.println("Product name(String): ");
            name = in.nextLine();
            System.out.println("Product quantity(int): ");
            quantity = in.nextInt();
            System.out.println("Product price(double): ");
            price = in.nextDouble();
            return new Product(index, name, quantity, price);
        }else{
            System.out.println("OK!");
            return null;
        }
    }

    private static void addVendor(){
        System.out.println("Want to add a vendor to product ( y / n )?");
        if (in.nextLine().equals("y")){
            Vendor vendor = new Vendor();
            System.out.println("Enter products name to add a vendor: ");
            Product product = products.get(in.nextLine());
            System.out.println("Enter vendor's name: ");
            vendor.setName(in.nextLine());
            System.out.println("Enter vendor's address: ");
            vendor.setAddress(in.nextLine());
            System.out.println("Enter vendor's contact: ");
            vendor.setContact(in.nextLine());
            System.out.println("Enter vendor's number: ");
            vendor.setPhoneNum(in.nextInt());
            product.setVendor(vendor);
        }else{
            System.out.println("OKEI!");
        }
    }

    public static void main(String[] args) {

        Product kartul = new Product(1, "Kartul", 10, 1.30);
        Product oun = new Product(2, "Õun", 34, 1.69);
        Product sibul = new Product(3, "Sibul", 4, 3.70);
        Product porgand = new Product(4, "Porgand", 23, 0.80);
        Product kapsas = new Product(5, "Kapsas", 5, 6.20);
        Product peet = new Product(6, "Peet", 347, 0.20);

        addToProducts(kartul);
        addToProducts(oun);
        addToProducts(sibul);
        addToProducts(porgand);
        addToProducts(kapsas);
        addToProducts(peet);

        String fee = "n";
        Product toAdd;
        while (true){
            toAdd = createNewProduct();
            if (toAdd != null) {
                addToProducts(toAdd);
            }
            addVendor();
            System.out.println("Want value with fee ( y / n )?");
            if (in.nextLine().equals("y")) {
                for (String key : products.keySet()) {
                    //ProductFee output = new ProductFee(products.get(key).getIndex(), products.get(key).getName(), products.get(key).getQuantity(), products.get(key).getPrice());
                    System.out.println(products.get(key).toString("yes"));
                }
            }else{
                for (String key : products.keySet()) {
                    System.out.println(products.get(key).toString());
                }
            }

        }
    }
}
