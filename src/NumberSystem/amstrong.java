package NumberSystem;

public class amstrong {
	public static void amstrongN(int n) {
		int temp=n;
		
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem*rem*rem;
			n/=10;
		}
		if(sum==temp) {
			System.out.println("this is a amstrong number");
		}
		else {
			System.out.println("this is not a amstrong number");
		}
	}
	public static void main(String[] args) {
		amstrongN(153);

	}

}
