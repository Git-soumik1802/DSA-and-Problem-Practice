package OOPS2;

public class BusBooking extends Booking {
	  public static String[] startDestinationArr = { "FLO-CAL", "CAL-GEO", "CAL-WAS" };
	    public static int[] busFareArr = { 200, 400, 600 };

	    private String busType;
	    private double totalBusFare;
	    private String day;

	    public BusBooking(String busType, Passenger passenger, String source, String destination, boolean returnJourney,
	            String day) {
	        super(passenger, source, destination, returnJourney);
	        this.busType = busType;
	        this.totalBusFare = 0;
	        this.day = day;
	    }

	    public double getTotalBusFare() {
	        return this.totalBusFare;
	    }
	    public void setTotalBusFare(double totalBusFare) {
			this.totalBusFare = totalBusFare;
		}


	    public int identifyChargedPercentage(String busType) {
	        int percentageCharge = 0;

	        if (busType.equalsIgnoreCase("ORDINARY"))
	            percentageCharge = 5;
	        else if (busType.equalsIgnoreCase("SEMISLEEPER"))
	            percentageCharge = 10;
	        else if (busType.equalsIgnoreCase("SLEEPER"))
	            percentageCharge = 20;
	        else
	            percentageCharge = -1;

	        return percentageCharge;
	    }

	    // To_Trainee
	 // To_Trainee
		public int findBaseFare() {
			int baseFare=0;
				String onwardJourney= this.getSource().substring(0,3)+"-"+this.getDestination().substring(0,3);
				String returnJourney= this.getDestination().substring(0,3)+"-"+this.getSource().substring(0,3);
				for(int i=0;i<BusBooking.startDestinationArr.length;i++) {
					if(BusBooking.startDestinationArr[i].equalsIgnoreCase(onwardJourney)||
						BusBooking.startDestinationArr[i].equalsIgnoreCase(returnJourney)) {
						return BusBooking.busFareArr[i];
					}
				}
						return -1;
					
				
		}

		// To_Trainee
		public void calculateTotalBusFare() {
			
			if(this.getPassenger().validatePassengerDetails()==false) {
				this.setTotalBusFare(-1.0);
				this.setPnrNumber("NA");
			}
			else {
				int baseFare=this.findBaseFare();
				int taxPercentage=this.identifyChargedPercentage(busType);
				if(baseFare!=-1 && taxPercentage!=-1) {
					double finalFare=baseFare+baseFare*(taxPercentage/100.0);
					if(this.day.equalsIgnoreCase("FRIDAY")||
							this.day.equalsIgnoreCase("SATURDAY")||
							this.day.equalsIgnoreCase("SUNDAY")) {
						finalFare+=30;
					}
					if(this.getPassenger().getAge()>60) {
						 finalFare=finalFare/2;
					}
					if(this.getReturnJourney()==true) {
						finalFare=2*finalFare;
						finalFare+=20;
					}
					else {
						finalFare+=10;	
					}
					this.setTotalBusFare(finalFare);
					this.generatePnrNumber();
				}
				else {
					this.setTotalBusFare(-1.0);
					this.setPnrNumber("NA");
				}
			}
		}

	   
		@Override
	    public String toString() {
	        return "BusBooking(busType=" + this.busType + ", passenger=" + this.getPassenger() + ", source="
	                + this.getSource() + ", destination=" + this.getDestination() + ", returnJourney="
	                + this.getReturnJourney() + ", day=" + this.day + ")";
	    }

		
}
