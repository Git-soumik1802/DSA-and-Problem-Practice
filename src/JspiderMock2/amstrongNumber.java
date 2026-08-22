package JspiderMock2;

public class amstrongNumber {
	public static void amstrong(int n) {
		int temp=n;
		int sum=0;
		int count=0;
		while(temp>0) {
			
			count++;
			temp/=10;
		}
		temp=n;
		
		while(temp>0) {
			int rem=temp%10;
			sum+=(int)(Math.pow(rem, count));
			temp/=10;
		}
		if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
		
	}
	public static void main(String[] args) {
		  amstrong(153);
	        amstrong(370);
	        amstrong(379);
	        amstrong(407);
	        amstrong(123);

	}

}
