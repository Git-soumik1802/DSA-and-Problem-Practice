package mock3;

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
		int a[] = {5, 2, 8, 1, 9, 3};

	    sort(a);

	    System.out.println("Sorted Array:");

	    for (int num : a) {
	        System.out.print(num + " ");
	    }

	}

}
