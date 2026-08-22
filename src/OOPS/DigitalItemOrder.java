
package OOPS;

public abstract class DigitalItemOrder {

    private Customer customer;
    private String itemName;
    private double orderPrice;
    private String orderId;
    private static int counter;

    static {
        counter = 1001;
    }

    public DigitalItemOrder(Customer customer, String itemName) {
        this.customer = customer;
        this.itemName = itemName;
    }

    public void generateOrderId() {
        orderId=this.itemName.charAt(0)+""+counter++;
    }

    public abstract void calculateOrderPrice();

    public Customer getCustomer() {
        return customer;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
