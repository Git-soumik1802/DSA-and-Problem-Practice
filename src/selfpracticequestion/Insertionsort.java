package selfpracticequestion;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		 int[] arr = {5, 2, 8, 1, 3};

	        sort(arr);

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	}

	public static void sort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
