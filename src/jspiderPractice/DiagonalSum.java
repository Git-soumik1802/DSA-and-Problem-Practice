package jspiderPractice;

public class DiagonalSum {

	public static int diagonalSum(int[][] matrix) {
		int n=matrix.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(i==j ||i+j==n-1 ) {
					sum+=matrix[i][j];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(diagonalSum(matrix));
	}
}