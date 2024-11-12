package Examples.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int ID = 1;
    private int id;
    private ORDER_STATUS status;
    private List<Observer> customers = new ArrayList<>();

    public Order() {
        this.id = ID++;
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    private void notifyCustomers() {
        for (Observer customer : customers) {
            customer.update(status);
        }
    }

    public void updateStatus(ORDER_STATUS orderStatus) {
        this.status = orderStatus;
        System.out.println("Order " + this.id + " status updated to: " + orderStatus);
        notifyCustomers();
        System.out.println();
    }
}
