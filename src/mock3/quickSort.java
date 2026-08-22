package mock3;

public class quickSort {
	public static void sort(int a[], int pivot, int high, int low) {
		int i = low;
		int j = high;
		pivot = a[(high + low) / 2];
		if (low >= high) {
			return;
		}
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
		if (low < j)
			sort(a, pivot, j, low);

		if (i < high)
			sort(a, pivot, high, i);
	}

	public static void main(String[] args) {
		int a[] = {8, 3, 1, 7, 0, 10, 2};

        sort(a, 0, a.length - 1, 0);

        for (int x : a) {
            System.out.print(x + " ");
        }

	}
}
