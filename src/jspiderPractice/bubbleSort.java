package jspiderPractice;

import java.util.Arrays;

public class bubbleSort {
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 6, 1, 3};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

	}

}
