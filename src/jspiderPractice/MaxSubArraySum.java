package jspiderPractice;

public class MaxSubArraySum {
	public static int maxSubArraySum(int a[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for( int i=0;i<a.length;i++) {
			currSum+=a[i];
			maxSum=Math.max(maxSum, currSum);
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		 int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

	        System.out.println(maxSubArraySum(a));

	}

}
