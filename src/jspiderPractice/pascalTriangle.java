package jspiderPractice;

public class pascalTriangle {
	public static void PrintTriangle(int n) {
		int pasTriangle[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0||i==j) {
					pasTriangle[i][j]=1;
				}
				else {
					pasTriangle[i][j]=pasTriangle[i-1][j-1]+pasTriangle[i-1][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(pasTriangle[i][k]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		 int n = 5;
	        PrintTriangle(n);

	}

}
