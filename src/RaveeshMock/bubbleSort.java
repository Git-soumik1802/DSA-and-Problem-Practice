package RaveeshMock;

public class bubbleSort {
	public static void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
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

}
