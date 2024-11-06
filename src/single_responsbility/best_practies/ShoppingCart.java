package single_responsbility.best_practies;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final Stock stock;
    private final List<Item> cartItems = new ArrayList<>();

    public ShoppingCart() {
        stock = new Stock();
    }

    public void removeFromCart(Item item) {
        cartItems.removeIf(it -> item.getCode().equals(it.getCode()));
    }

    public boolean addToCart(Item item) {
        if (stock.isAvailableQuantity(item)) {
            cartItems.add(item);
            return true;
        } else {
            return false;
        }
    }

    public int getItemsCount() {
        return cartItems.size();
    }
}
