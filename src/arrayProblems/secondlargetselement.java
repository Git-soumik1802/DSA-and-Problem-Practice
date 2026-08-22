package arrayProblems;

public class secondlargetselement {

	public static void main(String[] args) {
		int []arr= {1,2,3,5,6,3,7,9,6,4,3,6,8,9,11,11,2,3,2,3};
		int max2=secondlarge(arr);
		System.out.println(max2);

	}

	private static int secondlarge(int[] arr) {
		int max2=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			if(arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
			}
		}
		return max2;
	}

}
