package SearchingTechniques;

public class BinarySearch {
	public static int search(int a[],int target) {
		int low=0;
		int high=a.length-1;
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
		
		 int a[] = {10, 20, 30, 40, 50};

	        int target = 30;

	        int result = search(a, target);

	        System.out.println("Element found at index: " + result);
	}

}
