package Leetcode;

import java.util.Arrays;

public class SetMatrixZeroes {
	 public void setZeroes(int[][] matrix) {
		 int row=0;
		 int col=0;
	        for(int i=0;i<matrix.length;i++) {
	        	for(int j=0;j<matrix[i].length;j++) {
	        		if(matrix[i][j]==0) {
	        			row=i;
	        			col=j;
	        			matrix[row][0]=0;
	        			matrix[0][col]=0;
	        		}
	        	}
	        }
	        for(int[] x:matrix) {
				System.out.println(Arrays.toString(x));
			}
	    }
	public static void main(String[] args) {
		SetMatrixZeroes obj = new SetMatrixZeroes();

		int[][] matrix = {
				{1,1,1},
				{1,0,1},
				{1,1,1}
		};

		obj.setZeroes(matrix);
	}
	}


