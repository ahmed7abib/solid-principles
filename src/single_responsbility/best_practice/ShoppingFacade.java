package single_responsbility.best_practice;

import java.util.List;

public class ShoppingFacade {

    public void performShopping(List<Item> cart) {
        cart.forEach(new ShoppingCart()::addToCart);
        new SalesInvoice().createInvoice(cart);
    }
}
