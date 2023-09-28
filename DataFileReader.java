

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataFileReader {
    private Map<String, Double> pricesMap = new HashMap<>();

    public DataFileReader(String filename) {
        readDataFile(filename);
    }

    private void readDataFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String productName = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    pricesMap.put(productName, price);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getPrice(String productName) {
        return pricesMap.getOrDefault(productName, 0.0); // Default price if not found
    }
}
