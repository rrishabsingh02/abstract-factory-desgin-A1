
public class AppleFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        return new Apple();
    }
}
