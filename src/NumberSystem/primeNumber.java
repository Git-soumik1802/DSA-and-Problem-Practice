package NumberSystem;

public class primeNumber {
	public static void prime(int n) {
		if(n<=1) {
			System.out.println("Not Prime");
			return ;
		}
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				System.out.println("Not prime");
				return ;
			}
		}
				System.out.println("Prime");
			
		
	}
	public static void main(String[] args) {
		prime(6);

	}

}
