package selfpracticequestion;

public class secondlargest {
	public static int secondlargest(int []arr) {
		int n=arr.length;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
				
			}
			if(arr[i]>max2 && max1!=arr[i]) {
				max2=arr[i];
			}
		}
		return max2;
	}
public static void main(String[] args) {
	 int[] arr = {1,1,0,0};

     System.out.println(secondlargest(arr));
}
}
