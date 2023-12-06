package bev2;


import java.util.ArrayList;

public class BevShop implements BevShopInterface {

    private static final int MAX_FRUIT = 5;

    private static final int MIN_TIME = 8;
    private static final int MAX_TIME = 23;
    private static final int MIN_AGE_FOR_ALCOHOL = 21;
    private static final int MAX_ORDER_FOR_ALCOHOL = 3;

    private int numOfAlcoholInOrder;
    private int currentOrderIdx;
    private ArrayList<Order> orders;

    public BevShop() {
        orders = new ArrayList<>();
    }

    @Override
    public String toString() {
        String s = "Monthly Orders\n";

        for (Order o : orders) {
            s += o.toString();
        }
        s += "Total Sale: " + totalMonthlySale();

        return s;
    }

    @Override
    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

    @Override
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }

    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public boolean isMaxFruit(int num) {
        return num > MAX_FRUIT;
    }

    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public boolean isEligibleForMore() {
        return numOfAlcoholInOrder < MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public int getNumOfAlcoholDrink() {
        return numOfAlcoholInOrder;
    }

    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        Customer customer = new Customer(customerName, customerAge);
        Order order = new Order(time, day, customer);
        orders.add(order);
        currentOrderIdx = orders.indexOf(order);
        numOfAlcoholInOrder = 0;
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        orders.get(currentOrderIdx).addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        orders.get(currentOrderIdx).addNewBeverage(bevName, size, numOfFruits, addProtein);
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size) {
        orders.get(currentOrderIdx).addNewBeverage(bevName, size);
        numOfAlcoholInOrder++;
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        double orderSale = 0;

        for (Order o : orders) {
            if (o.getOrderNo() == orderNo) {
                for (Beverage b : o.getBeverages()) {
                    orderSale += b.calcPrice();
                }
            }
        }

        return orderSale;
    }

    @Override
    public double totalMonthlySale() {
        double totalSale = 0;

        for (Order o : orders) {
            for (Beverage b : o.getBeverages()) {
                totalSale += b.calcPrice();
            }
        }

        return totalSale;
    }

    @Override
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }

    @Override
    public void sortOrders() {
        for (int i = 0; i < orders.size() - 1; i++) {
            int minOrderNumIdx = i;
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(j).getOrderNo() < orders.get(minOrderNumIdx).getOrderNo()) {
                    minOrderNumIdx = j;
                }
            }

            Order temp = orders.get(minOrderNumIdx);
            orders.set(minOrderNumIdx, orders.get(i));
            orders.set(i, temp);
        }
    }

    @Override
    public Order getCurrentOrder() {
        return orders.get(currentOrderIdx);
    }

    @Override
    public Order getOrderAtIndex(int index) {
        return orders.get(index);
    }
}
