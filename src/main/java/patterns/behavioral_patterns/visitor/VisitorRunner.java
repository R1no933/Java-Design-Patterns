package patterns.behavioral_patterns.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "3333"),
                 new Book(100, "4444"),
                 new Book(140, "5555"),
                 new Fruit(10, 3, "Apple"),
                 new Fruit(30, 2, "Orange"),
                 new Fruit(15, 10, "Banana")
        };
        int totalCost = calculatePrice(items);
        System.out.println("Total cost is: " + totalCost);

    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
