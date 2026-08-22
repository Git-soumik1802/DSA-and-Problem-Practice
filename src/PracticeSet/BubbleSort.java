package PracticeSet;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int a[]) {
		for(int i=0;i<a.length-1;i++)	{
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
		 int[] arr = {5, 3, 8, 4, 2};

	        sort(arr);

	        System.out.println(Arrays.toString(arr));

	}

}
