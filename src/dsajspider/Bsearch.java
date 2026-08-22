package dsajspider;

import java.util.Scanner;

public class Bsearch {

    public static int search(int[] arr, int key) {

        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {

            int mid = (st + end) / 2;

            if (key == arr[mid]) {
                return mid;
            }

            else if (key < arr[mid]) {
                end = mid - 1;
            }

            else {
                st = mid + 1;
            }
        }

        return -1;
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

        int result = search(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
