package arrayProblems;

public class KadanesAlgo {
	public static int maxSubArraySum(int []a) {
		int maxSum=Integer.MIN_VALUE;
		int curSum=0;
		for(int i=0;i<a.length;i++) {
			curSum+=a[i];
			maxSum=Math.max(maxSum, curSum);
			if(curSum<0) {
				curSum=0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		
		 int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

	        int ans = maxSubArraySum(arr);

	        System.out.println(ans);
	}

}
