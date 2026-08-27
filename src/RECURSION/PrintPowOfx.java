package RECURSION;

public class PrintPowOfx {
	public static int pow(int n,int x) {
		if(n==0) {
			return 1;
		}
		if(n==1)return x;
		return x*pow(n-1,x);
	}
	public static void main(String[] args) {
		
		 int result = pow(5, 2);

	        System.out.println(result);
	}

}
