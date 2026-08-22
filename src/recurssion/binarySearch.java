package recurssion;

public class binarySearch {

    static int binarySearch(int[] arr, int left, int right, int target) {
    	if(left>right){
    		return -1;
    	}
        int mid=(left+right)/2;
        if(target==arr[mid]) {
        	return mid;
        }
        if(target<arr[mid]) {
        	return binarySearch( arr, left, mid-1, target);
        }
        return binarySearch( arr, mid+1, right	, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int index = binarySearch(arr, 0, arr.length - 1, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}