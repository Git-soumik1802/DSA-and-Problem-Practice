package SortingTechniques;

public class InsertionSort {
	public static void sort(int a[]) {
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
	public static void main(String[] args) {
		int a[] = {5, 2, 8, 1, 3};

        sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

	}

}
