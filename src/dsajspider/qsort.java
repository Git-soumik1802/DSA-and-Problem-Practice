package dsajspider;

public class qsort {

	private static void sort(int[] a, int st, int end) {

		if (st >= end) {
			return;
		}

		int i = st;
		int j = end;

		int pivot = a[(st + end) / 2];

		while (i <= j) {

			while (a[i] < pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i <= j) {

				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				i++;
				j--;
			}
		}

		sort(a, st, j);
		sort(a, i, end);
	}

	public static void main(String[] args) {

		int[] arr = { 5, 3, 8, 4, 2, 7, 1, 10 };

		sort(arr, 0, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
