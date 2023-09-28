public class Banana implements GroceryProduct {
    @Override
    public String getDescription() {
        return "Banana";
    }

    @Override
    public double getPrice() {
        DataFileReader dataFileReader = new DataFileReader("prices.txt");
        return dataFileReader.getPrice("Banana");
    }
}