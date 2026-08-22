package RaveeshMock;

public class insertionSort {

	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};

	    System.out.println("Before Sorting:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	    sort(arr);

	    System.out.println("\nAfter Sorting:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	}

	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}
		
	}

}
