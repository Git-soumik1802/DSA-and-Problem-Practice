package JspiderMock2;

import java.util.Iterator;

public class mergeSort {
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k]=b[j];
				k++;
				j++;
			}
			else {
				c[k]=a[i];
				i++;
				k++;
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
		
	}
	public static void sort(int a[]) {
		int left[]=new int [a.length/2];
		int right[]=new int [a.length-left.length];
		if (a.length <= 1) {
		    return;
		}
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=a[i+left.length];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void main(String[] args) {
		int a[] = {8, 3, 1, 6, 2, 7, 5, 4};

        sort(a);

        for (int num : a) {
            System.out.print(num + " ");
        }


	}

}
