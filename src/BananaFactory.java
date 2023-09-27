
public class BananaFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        return new Banana();
    }
}
