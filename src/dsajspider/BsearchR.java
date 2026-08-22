package dsajspider;

import java.util.Scanner;

public class BsearchR {

    public static int search(int[] a, int key, int st, int end) {

        if (st > end) {
            return -1;
        }

        int mid = (st + end) / 2;

        if (key == a[mid]) {
            return mid;
        }

        else if (key < a[mid]) {
            return search(a, key, st, mid - 1);
        }

        else {
            return search(a, key, mid + 1, end);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key element:");
        int key = sc.nextInt();

        int result = search(arr, key, 0, n - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}