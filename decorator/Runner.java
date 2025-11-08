package Decorator;

public class Runner {
    public static void main(String[] args) {
        PurchaseItem item = new BasicItem("Shirt", 20);
        System.out.println("Original Cost: $" + item.cost());
        System.out.println("Receipt: \n" + item.receipt());

        // Applying AdditionalPurchaseDecorator twice
        item = new ConcreteDecorator(item, 5);
        System.out.println("\nAfter First Additional Purchase:");
        System.out.println("Cost: $" + item.cost());
        System.out.println("Receipt: \n" + item.receipt());
//
        item = new ConcreteDecorator(item, 7);
        System.out.println("\nAfter Second Additional Purchase:");
        System.out.println("Cost: $" + item.cost());
        System.out.println("Receipt: \n" + item.receipt());
    }
}
