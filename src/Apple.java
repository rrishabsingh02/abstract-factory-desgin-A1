public class Apple implements GroceryProduct {
    @Override
    public String getDescription() {
        return "Apple";
    }

    @Override
    public double getPrice() {
        DataFileReader dataFileReader = new DataFileReader("prices.txt");
        return dataFileReader.getPrice("Apple");
    }
}