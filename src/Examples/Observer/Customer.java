package Examples.Observer;

public class Customer implements Observer {
    private static int ID = 1;
    private int id;
    private ORDER_STATUS orderStatus;

    public Customer() {
        this.id = ID;
        ID++;
    }

    public void update(ORDER_STATUS status) {
        this.orderStatus = status;
        displayStatus();
    }

    public void displayStatus() {
        System.out.println("Customer " + this.id + " received order status update: " + orderStatus);
    }
}
