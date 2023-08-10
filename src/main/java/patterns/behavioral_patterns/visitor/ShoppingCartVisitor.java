package patterns.behavioral_patterns.visitor;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
