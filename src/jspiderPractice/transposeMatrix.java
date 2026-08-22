package jspiderPractice;

public class transposeMatrix {
	 public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };
	        int r=matrix.length;
	        int c=matrix[0].length;
	        int[][] transpose = new int[c][r];
	        for(int i=0;i<r;i++) {
	        	for(int j=0;j<c;j++) {
	        		transpose[j][i]=matrix[i][j];
	        	}
	        }
	        System.out.println("Transpose Matrix:");
	        for (int i = 0; i < c; i++) {
	            for (int j = 0; j < r; j++) {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    }

