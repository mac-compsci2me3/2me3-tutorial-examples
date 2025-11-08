package Decorator;

public class BasicItem implements PurchaseItem {
    private String name;
    private double price;

    public BasicItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double cost() {
        return price;
    }

    @Override
    public String receipt() {
        return name + ": $" + price;
    }
}
