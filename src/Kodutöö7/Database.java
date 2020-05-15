package Kodutöö7;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private static final String CSV_FILE_PATH = "C:\\Users\\user\\Documents\\GitHub\\Java_kodutöö\\src\\Kodutöö7\\data.csv";

    public static void addDataToCSV(HashMap shelves) {
        addDataToCSV(CSV_FILE_PATH, shelves);
    }

    public static void addDataToCSV(String output, HashMap<String, ArrayList<Product>> shelves) {
        File file = new File(output);
        try {
            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            String[] header = {"Shelf", "Name", "Size"};
            writer.writeNext(header);

            for (String key : shelves.keySet()) {
                for (Product product : shelves.get(key)) {
                    String[] data1 = {key, product.getName(), Integer.toString(product.getSize())};
                    writer.writeNext(data1);
                }
            }

            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block 
            e.printStackTrace();
        }
    }
} 