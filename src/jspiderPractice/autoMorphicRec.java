package jspiderPractice;

public class autoMorphicRec {
	public static boolean automorphic(int n) {
		
		return check(n,n*n);
	}
	public static boolean check(int n,int square) {
		if(n==0) {
			return true;
		}
		if(n%10!=square%10) {
			return false;
		}
		return check(n/10,square/10);
	}
	public static void main(String[] args) {
		 System.out.println(automorphic(25));
	        System.out.println(automorphic(76));
	        System.out.println(automorphic(7));

	}

}
