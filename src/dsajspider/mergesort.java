package dsajspider;

import java.util.Arrays;

public class mergesort {
	public static void merge(int a[], int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {

			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}

		while (j < b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
	}

	public static void sort(int[] c) {
		int[] left = new int[c.length / 2];
		int[] right = new int[c.length - left.length];
		if (c.length == 1)
			return;
		for (int i = 0; i < left.length; i++) {
			left[i] = c[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = c[j + left.length];
		}
		sort(left);
		sort(right);
		merge(left, right, c);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 9, 3, 7 };

		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));

		sort(arr);

		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
