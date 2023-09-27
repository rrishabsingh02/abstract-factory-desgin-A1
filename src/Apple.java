import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Apple implements GroceryProduct {
    @Override
    public String getDescription() {
        return "Apple";
    }

    @Override
    public double getPrice() {
        // read prices of products from datafile
        double price = readPriceFromDataFile("prices.txt", "Apple");
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

        // return value if no price value is found in datafile
        return 0.0;
    }
}
