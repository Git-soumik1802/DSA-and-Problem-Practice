package finalPractice;

public class binarySearch {
	public static int search(int a[],int key) {
		int high=a.length-1;
		int low=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==key) {
				return mid;
			}
			if(key<a[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	    int[] arr = {2, 4, 6, 8, 10, 12, 14};

	    int target = 10;

	    int index = search(arr, target);

	    if (index != -1) {
	        System.out.println("Element found at index: " + index);
	    } else {
	        System.out.println("Element not found");
	    
	}
	}

}
