package JspiderMock2;

public class PrimePattern {
	static int num=2;
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	int n=4;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			while(!isPrime(num)) {
				num++;
			}
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}

	}

}
