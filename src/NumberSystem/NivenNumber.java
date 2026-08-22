package NumberSystem;

public class NivenNumber {
	public static void nivenNumber(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int m=n%10;
			sum+=m;
			n/=10;
		}
		if(temp%sum==0) {
			System.out.println("it's a niven number");
		}
		else {
			System.out.println("it's not a niven number");
		}
	}
	public static void main(String[] args) {
			nivenNumber(36);

	}

}
