import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(10, 50, Colour.GREEN);

        Food[] products = new Food[]{meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(products);

        cart.getTotalPrice();
        cart.getTotalPriceWithDiscount();
        cart.getTotalVegetarianPrice();
    }
}
