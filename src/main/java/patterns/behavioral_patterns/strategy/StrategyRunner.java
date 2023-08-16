package patterns.behavioral_patterns.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item firstItem = new Item("3345678", 300);
        Item secondItem = new Item("3345679", 150);

        cart.addItem(firstItem);
        cart.addItem(secondItem);

        cart.pay(new PaypalStrategy("exampleemail", "examplePassword"));

        cart.pay(new CreditCardStrategy("Ivanov Ivan",
                "5555 5555 5555 5555",
                "000",
                "10/10/2010"));
    }
}
