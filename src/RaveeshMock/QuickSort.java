package RaveeshMock;

public class QuickSort {
	public static void sort(int a[],int low,int high) {
		int i=low;
		int j=high;
		int pivot=a[(low+high)/2];
		if(low>=high) {
			return;
		}
		while(i<=j) {
			while(a[i]<pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,low,j);
		sort(a,i,high);
	}
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};

	    System.out.println("Before Sorting:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	    sort(arr,0,arr.length-1);

	    System.out.println("\nAfter Sorting:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	}

}
