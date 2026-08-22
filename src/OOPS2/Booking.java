package OOPS2;
class Booking {

    private static int counter = 1000;
    private String pnrNumber;
    private Passenger passenger;
    private String source;
    private String destination;
    private boolean returnJourney;

    public Booking(Passenger passenger, String source, String destination, boolean returnJourney) {
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
        this.returnJourney = returnJourney;
    }

    public String getPnrNumber() {
        return this.pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public String getSource() {
        return this.source;
    }

    public String getDestination() {
        return this.destination;
    }

    public boolean getReturnJourney() {
        return this.returnJourney;
    }

    // To_Trainee
    public void generatePnrNumber() {
    	char ch=getPassenger().getName().charAt(0);
        this.pnrNumber=Character.toUpperCase(ch)+(counter+1)+"";
        counter++;
    }
}