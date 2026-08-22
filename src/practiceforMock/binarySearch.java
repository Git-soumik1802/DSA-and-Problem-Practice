package practiceforMock;

public class binarySearch {
	public static int search(int a[], int target) {
		int high=a.length-1;
		int low=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==target) {
				return mid;
			}
			if(a[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		  int[] a = {1, 2, 4, 5, 8};

	        int index = search(a, 5);

	        System.out.println(index);

	}

}
