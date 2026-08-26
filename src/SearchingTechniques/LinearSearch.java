package SearchingTechniques;

public class LinearSearch {
	public static int search(int a[],int target) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
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
