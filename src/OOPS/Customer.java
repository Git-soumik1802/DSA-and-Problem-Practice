package OOPS;

public class Customer {

    private String custName;
    private String emailId;
    private int age;

    public Customer(String custName, String emailId, int age) {
        this.custName = custName;
        this.emailId = emailId;
        this.age = age;
    }

    public boolean validateCustomerDetails() {
        if(this.custName.length()>=4 && this.age>18 && 
        		(this.emailId.endsWith(".com")||this.emailId.endsWith(".edu"))) {
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

