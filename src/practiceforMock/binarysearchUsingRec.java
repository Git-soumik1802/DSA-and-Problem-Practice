package practiceforMock;

public class binarysearchUsingRec {
	public static int search(int a[],int target,int low,int high) {
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		if(a[mid]==target) {
			return mid;
		}
		if(a[mid]<target) {
			return search(a,target,mid+1,high);
		}
		return search(a,target,low,mid-1);
		
	}
	public static void main(String[] args) {
		 int[] a = {1, 2, 4, 5, 8};

	        int index = search(a, 5, 0,a.length - 1);

	        System.out.println(index);

	}

}
