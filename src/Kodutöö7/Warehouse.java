package Kodutöö7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Warehouse {

    private HashMap<String, ArrayList> shelves = new HashMap<>();

    public void saveToDb() {
        Database.addDataToCSV(shelves);
    }

    public void receive(Product product, String location) {
        if (shelves.containsKey(location)) {
            shelves.get(location).add(product);
        } else {
            shelves.put(location, new ArrayList(Arrays.asList(product)));
        }
    }

    public String dispatch(Product product) {
        for (String key : shelves.keySet()) {
            if (shelves.get(key).remove(product)) {
                return key;
            }
        }
        return null;
    }

    public int getItemCount(Product product) {
        int count = 0;
        for (String key : shelves.keySet()) {
            for (Object storedProduct : shelves.get(key)) {
                if (storedProduct.equals(product)) {
                    count++;
                }
            }
        }
        return count;
    }
}