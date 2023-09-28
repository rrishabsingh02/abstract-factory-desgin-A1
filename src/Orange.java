package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Orange implements GroceryProduct {
    @Override
    public String getDescription() {
        return "Orange";
    }

    @Override
    public double getPrice() {
        // Read the price from the data file
        double price = readPriceFromDataFile("prices.txt", "Orange");
        return price;
    }

    private double readPriceFromDataFile(String filename, String productName) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2 && parts[0].equals(productName)) {
                    return Double.parseDouble(parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Default price if not found in the data file
        return 5.0;
    }
}
