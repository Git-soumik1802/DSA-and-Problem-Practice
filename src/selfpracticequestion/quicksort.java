package selfpracticequestion;

public class quicksort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        sort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sort(int[] a, int st, int end) {

        if (st >= end) {
            return;
        }

        int i = st;
        int j = end;

        int pivot = (st + end) / 2;

        while (i <= j) {

            while (a[i] < a[pivot]) {
                i++;
            }

            while (a[j] > a[pivot]) {
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

        if (st < j) {
            sort(a, st, j);
        }

        if (i < end) {
            sort(a, i, end);
        }
    }
}