package jspiderPractice;

public class MatrixMultiplication {

    public static int[][] multiplication(int a[][], int b[][]) {

        int row1 = a.length;
        int col1 = a[0].length;
        int row2 = b.length;
        int col2 = b[0].length;

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible.");
            return null;
        }

        int[][] c = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] ans = multiplication(a, b);

        if (ans != null) {
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}