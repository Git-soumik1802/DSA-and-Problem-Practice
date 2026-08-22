package OOPS2;
class Passenger {

    private static String[] domainArr = { "gmail", "yahoo", "hotmail" };
    private String name;
    private int age;
    private String phoneNo;
    private String emailId;

    public Passenger(String name, int age, String phoneNo, String emailId) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getEmailId() {
        return this.emailId;
    }

    // To_Trainee
    public Boolean validatePassengerDetails() {
    	for(int i=0;i<Passenger.domainArr.length;i++) {
    		if(this.age>12 && this.name.length()>=3 && 
    		(this.phoneNo.charAt(0)=='9' && this.phoneNo.length()==10) && 
    		this.emailId.contains(Passenger.domainArr[i])&& this.emailId.endsWith(".com")) {
    			return true;
    		}
    	}
    	return false;
    }
}
