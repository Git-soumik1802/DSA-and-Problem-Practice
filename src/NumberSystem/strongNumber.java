package NumberSystem;

public class strongNumber {
	public static int fact(int n) {
		if(n==1||n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void Strongnum(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=fact(rem);
			n/=10;
		}
		if(temp==sum) {
			System.out.println("Strong Number");
		}
		else {
		System.out.println("not Strong number");
		}
	}
	public static void main(String[] args) {
		Strongnum(40585);

	}

}
