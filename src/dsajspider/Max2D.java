package dsajspider;

import java.util.Scanner;

public class Max2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] a = new int[n][m];

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = sc.nextInt();

				if (a[i][j] > max) {
					secondMax = max;
					max = a[i][j];
				} else if (a[i][j] > secondMax && a[i][j] != max) {
					secondMax = a[i][j];
				}

				if (a[i][j] < min) {
					secondMin = min;
					min = a[i][j];
				} else if (a[i][j] < secondMin && a[i][j] != min) {
					secondMin = a[i][j];
				}
			}
		}

		System.out.println("Max = " + max);
		System.out.println("Second Max = " + secondMax);

		System.out.println("Min = " + min);
		System.out.println("Second Min = " + secondMin);
	}
}