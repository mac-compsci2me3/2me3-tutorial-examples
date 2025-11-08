package Decorator;

public class ConcreteDecorator implements PurchaseItem {
    private PurchaseItem item;
    private double additionalCost;

    public ConcreteDecorator(PurchaseItem item, double additionalCost) {
        this.item = item;
        this.additionalCost = additionalCost;
    }

    @Override
    public double cost() {
        return item.cost() + additionalCost;
    }

    @Override
    public String receipt() {
        return item.receipt() + "Additional Purchase - $" + additionalCost + "\n";
    }
}
