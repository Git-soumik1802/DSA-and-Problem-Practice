package selfpracticequestion;

public class LCMandGCD {

	public static void main(String[] args) {
		int n=12;
		int m=16;
		int gcd=1;
		for(int i=1;i<=n;i++) {
			if(n%i==0 && m%i==0) {
				gcd*=i;
			}
		}
		int Lcm=(n*m)/gcd;
		System.out.print("gcd:-"+gcd+"Lcm:-"+Lcm);
	}

}
