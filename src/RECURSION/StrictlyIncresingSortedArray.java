package RECURSION;

public class StrictlyIncresingSortedArray {
	public static boolean isSorted(int a[],int idx) {
		if(idx==a.length-1) {
			return true;
		}
		if(a[idx]<a[idx+1]) {
			return isSorted(a,idx+1);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		 int a[] = {1, 2, 2, 4, 5};

	        System.out.println(isSorted(a, 0));
	}

}
