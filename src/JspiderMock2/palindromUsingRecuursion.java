package JspiderMock2;

public class palindromUsingRecuursion {
	public static boolean isPal(int n,int o,int r) {
		if(n==0) {
			return o==r;
		}
		return isPal(n/10,o,r*10+(n%10));
	}
	public static void main(String[] args) {
		 int n = 1231;

	        if (isPal(n, n, 0)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }

	}

}
