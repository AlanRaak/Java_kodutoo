package Kodutöö5;

import java.util.Hashtable;
import java.util.Scanner;

public class ProductTester {

    private static Scanner in = new Scanner(System.in);
    private static Hashtable<String, Product> products = new Hashtable<>();
    private static Hashtable<String, ProductTable> productsTable = new Hashtable<>();

    private static void addToProducts(Product product){
        if (products.containsKey(product.getName())){
            products.get(product.getName()).setQuantityAdd(product.getQuantity());
        }else{
            products.put(product.getName(), product);
        }
    }

    private static void addToProductsTable(ProductTable productTable){
        if (productsTable.containsKey(productTable.getName())){
            productsTable.get(productTable.getName()).setQuantityAdd(productTable.getQuantity());
        }else{
            productsTable.put(productTable.getName(), productTable);
        }
    }

    private static void createNewProduct(){
        System.out.println("Add product ( y / n )?");
        if (in.nextLine().equals("y")){
            System.out.println("Add product(table) ( y / n )?");
            String wantTable = in.nextLine();

            int index = 69; // ei kasuta toote numbreid(indekseid), indekseerimine toimub toote nime järgi
            String name;
            int quantity;
            double price;
            int legs;

            System.out.println("Product name(String): ");
            name = in.nextLine();
            System.out.println("Product quantity(int): ");
            quantity = Integer.parseInt(in.nextLine());
            System.out.println("Product price(double): ");
            price = Double.parseDouble(in.nextLine());

            if (wantTable.equals("y")){
                System.out.println("Product(table) number of legs(int): ");
                legs = Integer.parseInt(in.nextLine());
                addToProductsTable(new ProductTable(index, name, quantity, price, legs));
            }else{
            addToProducts(new Product(index, name, quantity, price));
            }
        }else{
            System.out.println("OK!");
        }
    }

    private static void addVendor(){
        System.out.println("Want to add a vendor to product ( y / n )?");
        if (in.nextLine().equals("y")){
            Vendor vendor = new Vendor();
            System.out.println("Enter vendor's name(String): ");
            vendor.setName(in.nextLine());
            System.out.println("Enter vendor's address(String): ");
            vendor.setAddress(in.nextLine());
            System.out.println("Enter vendor's contact(String): ");
            vendor.setContact(in.nextLine());
            System.out.println("Enter vendor's number(int): ");
            vendor.setPhoneNum(Integer.parseInt(in.nextLine()));

            System.out.println("Enter products name to add a vendor to(String): ");
            String productName = in.nextLine();
            if (productsTable.containsKey(productName)){
                productsTable.get(productName).setVendor(vendor);
            }else{
                products.get(productName).setVendor(vendor);
            }
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

        ProductTable peet_table = new ProductTable(6, "PeetLaud", 347, 0.20, 5);

        addToProducts(kartul);
        addToProducts(oun);
        addToProducts(sibul);
        addToProducts(porgand);
        addToProducts(kapsas);
        addToProducts(peet);

        addToProductsTable(peet_table);


        while (true){
            createNewProduct();
            addVendor();
            System.out.println("Want values printed( y / n )?");
            if (in.nextLine().equals("y")) {
                System.out.println("Normal products: ");
                for (String key : products.keySet()) {
                    System.out.println(products.get(key).toString());
                }

                System.out.println("Tables: ");
                for (String key : productsTable.keySet()) {
                    System.out.println(productsTable.get(key).toString());
                }
            }
        }
    }
}
