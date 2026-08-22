package jspiderPractice;

public class primeReccursion {
public static boolean isPrime(int n,int i) {
	if(n==0||n==1) {
		return false;
	}
	if(i*i>n) {
		return true;
	}
	if(n%i==0) {
		return false;
	}
	return isPrime(n,i+1);
}
	public static void main(String[] args) {
		 int n = 7;

	        if (isPrime(n, 2)) {
	            System.out.println(n + " is Prime");
	        } else {
	            System.out.println(n + " is Not Prime");
	        }

	}

}
