package NumberSystem;

public class spyNumber {
	public static void spyNumber(int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			sum+=n%10;
			mul*=n%10;
			n/=10;
		}
		if(sum==mul) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}
	}
	public static void main(String[] args) {
		spyNumber(1123);

	}

}
