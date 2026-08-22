package PracticeSet;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
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
		int l[]=new int [a.length/2];
		int r[]=new int [a.length-l.length];
		if(a.length<=1) {
			return ;
		}
		for(int i=0;i<l.length;i++) {
			l[i]=a[i];
		}
		for(int i=0;i<r.length;i++) {
			r[i]=a[l.length+i];
		}
		sort(l);
		sort(r);
		merge(l,r,a);
	}
	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 4, 2};

        sort(arr);

        System.out.println(Arrays.toString(arr));

	}

}
