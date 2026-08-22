package mock4;

public class binarysearch {
	public static int search(int a[],int target) {
		int low=0;
		int high=a.length-1;
		int n=a.length;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==target) {
				return mid;
			}
			if(a[mid]>target) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 50;

        int index = search(a, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
	}

}
