package JspiderMock2;

import java.util.Arrays;

public class Qsort {
	public static void sort(int a[],int pivot,int low,int high) {
		int i=low;
		int j=high;
		pivot=a[(low+high)/2];
		if(low>=high) {
			return ;
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
		sort(a,pivot,low,j);
		sort(a,pivot,i,high);
	}
public static void main(String[] args) {
	int a[] = {9, 5, 2, 7, 1, 6, 8, 3, 4};

    sort(a, 0, 0, a.length - 1);

    System.out.println(Arrays.toString(a));
}
}
