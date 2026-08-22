package jspiderPractice;

public class SpiralMatrix {

    public static void printSpiral(int[][] matrix) {
       int top=0;
       int down=matrix.length-1;
       int left=0;
       int right=matrix[0].length-1;
       while(top<=down && left<=right) {
    	   for(int i=left;i<=right;i++) {
    		   System.out.print(matrix[top][i]+" "); 
    	   }
    	   top++;
    	   for(int i=top;i<=down;i++) {
    		   System.out.print(matrix[i][right]+" ");
    	   }
    	   right--;
    	   if(top<=down) {
    	   for(int i=right;i>=left;i--) {
    		   System.out.print(matrix[down][i]+" ");
    	   }
    	   down--;
    	   }
    	   if(left<=right) {
    	   for(int i=down;i>=top;i--) {
    		   System.out.print(matrix[i][left]+" ");
    	   }
    	   left++;
    	   }
       }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }
}