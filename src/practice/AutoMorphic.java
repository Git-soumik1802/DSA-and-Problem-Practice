package practice;

public class AutoMorphic {
	public static boolean isAutomorphic(int n) {
		int square=n*n;
		int temp=n;
		while(temp>0) {
			if(temp%10!=square%10) {
				return false;
			}
			temp/=10;
			square/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		 int n = 25;

	        if (isAutomorphic(n)) {
	            System.out.println("Automorphic Number");
	        } else {
	            System.out.println("Not Automorphic Number");
	        }

	}

}
