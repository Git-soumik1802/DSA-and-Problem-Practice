package finalPractice;

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
		int[] arr = {45, 12, 78, 3, 56, 91, 24, 67, 8, 39, 14, 82, 50, 29, 73, 5, 97, 18, 64, 41, 10, 88, 31, 60, 2, 76, 54, 20, 99, 7, 36, 85, 15, 70, 43, 26, 95, 11, 58, 33, 80, 1, 66, 22, 49, 90, 13, 62, 37, 100};

	    sort(arr);

	    System.out.println("Sorted Array:");

	    for (int num : arr) {
	        System.out.print(num + " ");
	    }


	}

}
