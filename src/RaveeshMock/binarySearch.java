package RaveeshMock;

public class binarySearch {
public static int search(int a[],int target) {
	int st=0;
	int end=a.length-1;
	while(st<=end) {
		int mid=(st+end)/2;
		if(a[mid]==target) {
			return mid;
		}
		if(a[mid]<target) {
			st=mid+1;
		}
		else {
			end=mid-1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int[] arr = {11, 12, 22, 25, 34, 64, 90};

	    int target = 25;

	    int index = search(arr, target);

	    if (index != -1) {
	        System.out.println("Element found at index: " + index);
	    } else {
	        System.out.println("Element not found");
	    }
	}

}
