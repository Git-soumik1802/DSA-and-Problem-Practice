package practiceforMock;

public class selectionSort {
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
	}
	public static void main(String[] args) {
		 int[] a = {5, 1, 4, 2, 8};

	        sort(a);

	        for (int num : a) {
	            System.out.print(num + " ");

	}

	}

}
