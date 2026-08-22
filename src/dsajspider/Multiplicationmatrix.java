package dsajspider;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplicationmatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows and columns of first matrix:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();

		System.out.println("Enter rows and columns of second matrix:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		// Condition for multiplication
		if (c1 != r2) {
			System.out.println("Matrix multiplication not possible");
			return;
		}
		int[][] a = new int[r1][c1];
		int[][] b = new int[r2][c2];
		int[][] c = new int[r1][c2];

		// Input first matrix
		System.out.println("Enter first matrix elements:");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Input second matrix
		System.out.println("Enter second matrix elements:");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		// Matrix multiplication
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		System.out.println("Result Matrix:"+ Arrays.deepToString(c));

		
	}
}