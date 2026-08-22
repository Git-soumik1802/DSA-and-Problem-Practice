package mock4;

public class MedianofTwoSortedArray {

    public static double findMedian(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while (i < a.length) {
            arr[k++] = a[i++];
        }

        while (j < b.length) {
            arr[k++] = b[j++];
        }

        int n = arr.length;

        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        return arr[n / 2];
    }

    public static void main(String[] args) {

        int[] a = {1, 3};
        int[] b = {2, 4};

        System.out.println(findMedian(a, b));
    }
}
