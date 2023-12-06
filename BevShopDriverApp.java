package bev2;

public class BevShopDriverApp {
    public static void main(String[] args) {
        // Create an instance of BevShop
        BevShop bevShop = new BevShop();

        // Simulate orders
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
        bevShop.processCoffeeOrder("Latte", Size.MEDIUM, true, false);
        bevShop.processSmoothieOrder("Tropical", Size.SMALL, 3, true);
        bevShop.processAlcoholOrder("Wine", Size.LARGE);

        // Print monthly orders and total sale
        System.out.println(bevShop.toString());
    }
}