package PFQuestionsCodeChefs;

public class PF4 {
	 static void findPrimeFactors(int n) {

	        for (int i = 2; i <= n; i++) {
	            while (n % i == 0) {
	                System.out.print(i + " ");
	                n = n / i;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int number = 60;
	        findPrimeFactors(number);
	    }
	
}
