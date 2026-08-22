
package OOPS;

public class Tester {
    public static void main(String[] args) {

        Customer c1 = new Customer("Nitin", "nj@123.edu", 30);

        MusicOrder m1 = new MusicOrder(c1, "Video", "mp3", 128, 120);

        m1.calculateOrderPrice();

        System.out.println("Order Price: " + m1.getOrderPrice());
        System.out.println("Order ID: " + m1.getOrderId());
    }
}

