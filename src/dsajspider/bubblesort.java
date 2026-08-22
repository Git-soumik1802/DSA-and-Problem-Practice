package dsajspider;

import java.util.Scanner;

public class bubblesort {

    public static void bubbleSort(int[] arr, int n) {

        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}