package RaveeshMock;

public class selectionSort {
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int min =i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
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
