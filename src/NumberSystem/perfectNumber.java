package NumberSystem;

public class perfectNumber {
	public static void perfect(int n) {
		int sum=0;
		for( int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("it's a perfect number");
		}else {
			System.out.println("it's not a perfect number");
		}
	}
	public static void main(String[] args) {
		perfect(8);

	}

}
