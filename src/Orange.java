package src;

public class Orange implements GroceryProduct {
    @Override
    public String getDescription() {
        return "Orange";
    }

    @Override
    public double getPrice() {
        DataFileReader dataFileReader = new DataFileReader("prices.txt");
        return dataFileReader.getPrice("Orange");
    }
}