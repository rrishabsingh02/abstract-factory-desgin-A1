///////////////////////
//-----TEST CLASS----//
///////////////////////
public class GroceryStore {

    public static void main(String[] args) {
        

        // create a Banana via BananaFactory
        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProduct banana = bananaFactory.createProduct();

        // create an Apple via AppleFactory
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProduct apple = appleFactory.createProduct();

        // create an Orange via OrangeFactory
        GroceryProductFactory orangeFactory = new OrangeFactory();
        GroceryProduct orange = orangeFactory.createProduct();

        // display product and price
        System.out.println("Product: " + banana.getDescription());
        System.out.println("Price: $" + banana.getPrice());

        System.out.println("Product: " + apple.getDescription());
        System.out.println("Price: $" + apple.getPrice());

        System.out.println("Product: " + orange.getDescription());
        System.out.println("Price: $" + orange.getPrice());
    }
}
