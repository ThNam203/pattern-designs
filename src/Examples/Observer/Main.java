package Examples.Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Order order2 = new Order();

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        order.registerCustomer(customer1);
        order.registerCustomer(customer2);
        order2.registerCustomer(customer3);

        order.updateStatus(ORDER_STATUS.PREPARING);
        order.updateStatus(ORDER_STATUS.DELIVERING);

        order2.updateStatus(ORDER_STATUS.PREPARING);
        order.updateStatus(ORDER_STATUS.DELIVERED);

        order2.updateStatus(ORDER_STATUS.DELIVERING);
        order2.updateStatus(ORDER_STATUS.DELIVERED);
    }
}
