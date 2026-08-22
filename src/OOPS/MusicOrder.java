
package OOPS;

public class MusicOrder extends DigitalItemOrder {

	private String musicFormat;
	private int bitRate;
	private int durationInSec;

	private static String[] musicFormatAvailable = { "mp3", "wav", "flac" };
	private static int[] bitRateAvailable = { 192, 128, 256 };
	private static double[] bitRateCost = { 15.0, 10.0, 20.0 };

	public MusicOrder(Customer customer, String itemName, String musicFormat, int bitRate, int durationInSec) {
		super(customer, itemName);
		this.musicFormat = musicFormat;
		this.bitRate = bitRate;
		this.durationInSec = durationInSec;
	}

	@Override
	public void calculateOrderPrice() {
		
		this.getCustomer().validateCustomerDetails();
		for (int i = 0; i < MusicOrder.musicFormatAvailable.length; i++) {
			if (MusicOrder.musicFormatAvailable[i].equalsIgnoreCase(musicFormat)
					&& this.getCustomer().validateCustomerDetails() == true) {
				int bitRateIndex = this.validateBitRate();
				if (bitRateIndex != -1 && this.durationInSec > 0) {
					double baseCost = MusicOrder.bitRateCost[bitRateIndex];
					baseCost = baseCost + 3 * (durationInSec / 60);
					baseCost += (baseCost * 0.05);
					super.setOrderPrice(baseCost);
					super.generateOrderId();
					 break;
				} else {
					super.setOrderPrice(-1.0);
					this.setOrderId("NA");
				}
			} else {
				super.setOrderPrice(-1.0);
				this.setOrderId("NA");
			}
		}

	}


	public int validateBitRate() {
		int index = -1;
		for (int i = 0; i < MusicOrder.bitRateAvailable.length; i++) {
			if (MusicOrder.bitRateAvailable[i] == this.bitRate) {
				index = i;
				return index;
			}
		}

		return -1;
	}
}
