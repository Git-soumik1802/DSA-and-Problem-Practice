package recurssion;

public class primeNumber {
	static boolean isPrime(int n, int i) {
		if(n<2) {
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
	  static int findSecondPrime(int[] arr, int index, int count){
		  if(index==arr.length) {
			  return -1;
		  }
		  if(isPrime(arr[index], 2)) {
			  count++;
			  if(count==2) {
				  return arr[index];
			  }
		  }
		  return findSecondPrime(arr, index+1, count);
	  }

	    public static void main(String[] args) {

	        int[] arr = {4, 7, 8, 11, 15, 17, 19};

	        int secondPrime = findSecondPrime(arr, 0, 0);

	        if (secondPrime != -1) {
	            System.out.println("Second Prime Number: " + secondPrime);
	        } else {
	            System.out.println("Second Prime Number not found");
	        }
	    }'.'

}
