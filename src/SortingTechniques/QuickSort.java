package SortingTechniques;

public class QuickSort {
	public static void sort(int a[],int low,int high) {
		
		if(low>=high) {
			return ;
		}
		int i=low;
		int j=high;
		int pivot=a[(low+high)/2];
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
	    int a[] = {5, 2, 8, 1, 3};

        sort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

	}

}
