package Leetcode;

public class MinimizedMaximumofProductsDistributedtoAnyStore {
	 public static int minimizedMaximum(int n, int[] quantities) {
		 int sum=0;
		 for(int i=0;i<quantities.length;i++) {
			
			 if(n==1) {
				 sum+=quantities[i];
				 return sum;
			 }
			
			 sum+=quantities[i];
			
			 
		 }
		if(sum%n==0) {
			return sum/n;
		}
		else {
			return (sum/n)+1;
		}
	     
	    }
	public static void main(String[] args) {
		int a[]= {15,10,10};
		minimizedMaximum(7,a );

	}

}
