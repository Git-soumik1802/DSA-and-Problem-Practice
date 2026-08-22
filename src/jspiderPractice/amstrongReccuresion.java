package jspiderPractice;

public class amstrongReccuresion {
	static int digit;
	public static int countDigit(int n) {
		if(n==0) {
			return 0;
		}
		return 1+countDigit(n/10);
	}
	
	public static int amstrongrec(int n) {
		if (n==0){
			return 0;
		}
		
		return (int)Math.pow(n%10,digit )+amstrongrec(n/10);
	}
	public static void main(String[] args) {
		
		  int n = 153;
	        digit = countDigit(n);

	        if (amstrongrec(n) == n) {
	            System.out.println("Armstrong Number");
	        } else {
	            System.out.println("Not Armstrong Number");
	        }
	}

}
