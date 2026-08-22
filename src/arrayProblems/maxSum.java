package arrayProblems;

public class maxSum {
	public static int max(int []arr) {
		int maxN=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>maxN) {
				maxN=arr[i];
			}
		}
		return maxN;
	}
public static void main(String[] args) {
	 int[] arr = {4, 7, 1, 9, 2};

     int ans = max(arr);

     System.out.println("Maximum element is: " + ans);
}
}
