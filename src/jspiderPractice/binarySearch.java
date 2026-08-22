package jspiderPractice;

public class binarySearch {
	public static int search(int a[],int target) {
		int low=0;
		int high=a.length-1;
		
		while(low<=high) {
			int mid=(high+low)/2;
			if(a[mid]==target) {
				return mid;
			}
			if(target>a[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
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


