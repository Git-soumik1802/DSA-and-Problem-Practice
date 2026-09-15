package practice;

public class AmstrongNumber {
	public static boolean isAmstrong(int n) {
		int org=n;
		int sum=0;
		int digits=0;
		int temp=n;
		while(temp>0) {
			digits++;
			temp/=10;
		}
		temp=n;
		while(temp>0) {
			int digit=temp%10;
			sum+=(int)Math.pow(digit, digits);
			temp/=10;
		}
		
		return sum==org;
		
	}
	public static void main(String[] args) {
		 int n = 1543;

	        if (isAmstrong(n)) {
	            System.out.println("Armstrong Number");
	        } else {
	            System.out.println("Not Armstrong Number");
	        }

	}

}
