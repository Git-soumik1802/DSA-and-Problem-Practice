package jspiderPractice;

public class mergeSort {
	public static void sort(int a[]) {
		int left[]=new int[a.length/2];
		int right[]=new int [a.length-left.length];
		if(a.length<=1) {
			return ;
		}
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=a[left.length+i];
			
		}
		sort(left);
		sort(right);
		merge(a,left,right);
	}
	public  static void merge(int[] a, int[] left, int[] right) {
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
				k++;
			}
			else {
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			a[k]=right[j];
			j++;
			k++;
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {45, 12, 78, 3, 56, 91, 24, 67, 8, 39, 14, 82, 50, 29, 73, 5, 97, 18, 64, 41, 10, 88, 31, 60, 2, 76, 54, 20, 99, 7, 36, 85, 15, 70, 43, 26, 95, 11, 58, 33, 80, 1, 66, 22, 49, 90, 13, 62, 37, 100};

	    sort(arr);

	    System.out.println("Sorted Array:");

	    for (int num : arr) {
	        System.out.print(num + " ");
	    }

	}

}
