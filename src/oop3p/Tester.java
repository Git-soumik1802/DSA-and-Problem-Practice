package oop3p;

class Customer {

    private String custName;
    private String emailId;
    private int age;

    public Customer(String custName, String emailId, int age) {
        this.custName = custName;
        this.emailId = emailId;
        this.age = age;
    }

    public boolean validateCustomerDetails() {
    	if(this.custName.length()>=4 && this.age>18 && (this.emailId.endsWith(".com")||this.emailId.endsWith(".edu") )){
    		return true;
    	}
       
    	return false;
    }

    public String getCustName() {
        return custName;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }
}

abstract class DigitalItemOrder {

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
       orderId=this.itemName.charAt(0)+""+counter;
       counter++;
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

class MusicOrder extends DigitalItemOrder {

    private String musicFormat;
    private int bitRate;
    private int durationInSec;

    private static String[] musicFormatAvailable = {"mp3", "wav", "flac"};
    private static int[] bitRateAvailable = {192, 128, 256};
    private static double[] bitRateCost = {15.0, 10.0, 20.0};

    public MusicOrder(Customer customer, String itemName,
                      String musicFormat, int bitRate, int durationInSec) {

        super(customer, itemName);

        this.musicFormat = musicFormat;
        this.bitRate = bitRate;
        this.durationInSec = durationInSec;
    }

    @Override
    public void calculateOrderPrice() {
    	 this.getCustomer().validateCustomerDetails();
    	    for (int i = 0; i < MusicOrder.musicFormatAvailable.length; i++) {
    	        if (this.musicFormat.equalsIgnoreCase(MusicOrder.musicFormatAvailable[i])) {
    	            int bitRateIndex = this.validateBitRate();
    	            if (bitRateIndex != -1 && durationInSec > 0) {
    	                double baseCost = MusicOrder.bitRateCost[bitRateIndex];
    	                baseCost = baseCost + 3 * (durationInSec / 60);
    	                baseCost += (baseCost * 0.05);
    	                super.setOrderPrice(baseCost);
    	                super.generateOrderId();
    	                break;
    	            }
    	            super.setOrderPrice(-1);
    	            super.setOrderId("NA");
    	        }
    	        super.setOrderPrice(-1);
    	        super.setOrderId("NA");
      }
    }

    public int validateBitRate() {

       
        for(int i=0;i<MusicOrder.bitRateAvailable.length;i++) {
        	if(this.bitRate==MusicOrder.bitRateAvailable[i]) {
        		return i;
        	}
        }

        return -1;
    }
}

public class Tester {

    public static void main(String[] args) {

        Customer c1 = new Customer("Nitin", "nj@123.edu", 30);

        MusicOrder m1 =
            new MusicOrder(c1, "Video", "mp3", 128, 120);

        m1.calculateOrderPrice();

        System.out.println("Order Price: " + m1.getOrderPrice());
        System.out.println("Order ID: " + m1.getOrderId());
    }
}