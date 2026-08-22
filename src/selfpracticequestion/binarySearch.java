package selfpracticequestion;

public class binarySearch {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 5, 8};

	        int index = search(arr, 5);

	        System.out.println("Index: " + index);

	}

	private static int search(int[] a, int target) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

}
