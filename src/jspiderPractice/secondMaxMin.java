package jspiderPractice;

public class secondMaxMin {

    public static void secondMaxMin(int[][] matrix) {

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix[i].length;j++) {
        		if(matrix[i][j]>max1) {
        			max2=max1;
        			max1=matrix[i][j];
        		}
        		if(matrix[i][j]>max2 && matrix[i][j]!=max1) {
        			max2=matrix[i][j];
        		}
        		if(matrix[i][j]<min1) {
        			min2=min1;
        			min1=matrix[i][j];
        		}
        		if(matrix[i][j]<min2 && matrix[i][j]!=min1) {
        			min2=matrix[i][j];
        		}
        	}
        	
        }
        System.out.println("Maximum = " + max1);
    	System.out.println("Second Maximum = " + max2);
    	System.out.println("Minimum = " + min1);
    	System.out.println("Second Minimum = " + min2);
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {5, 8, 1},
                {9, 3, 7},
                {2, 6, 4}
        };

        secondMaxMin(matrix);
    }
}