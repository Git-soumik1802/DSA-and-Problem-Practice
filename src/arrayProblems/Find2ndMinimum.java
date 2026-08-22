package arrayProblems;

public class Find2ndMinimum {

	public static void main(String[] args) {
		 int[] arr = {4, 7,1, 1, 9, 2};

	        int ans = Minimum(arr);

	        System.out.println("Minimum element is: " + ans);

	}

	private static int Minimum(int[] arr) {
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			if(arr[i]<min2 && arr[i]!=min1) {
				min2=arr[i];
			}
		}
		return min2;
	}

}
