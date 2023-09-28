package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataFileReader {
    private final String filename;

    public DataFileReader(String filename) {
        this.filename = filename;
    }

    public double getPrice(String productName) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3 && parts[0].equals(productName)) {
                    return Double.parseDouble(parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Default price if not found in the data file
        return 0.0;
    }
}
