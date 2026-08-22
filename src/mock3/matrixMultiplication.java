package mock3;

public class matrixMultiplication {

	public static int[][] multiple(int a[][],int b[][]){
		int r1=a.length;
		int c1=a[0].length;
		int r2=b.length;
		int c2=b[0].length;
		int c[][]=new int [r1][c2];
		if(c1==r2) {
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<c1;k++) {
					c[i][j]=a[i][k]+c[k][j];	
					}
				}
			}
			return c;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {

	    int a[][] = {
	            {1, 2,4},
	            {3, 4,5}
	    };

	    int b[][] = {
	            {5, 6},
	            {7, 8}
	    };

	    int result[][] = multiple(a, b);

	    if (result != null) {
	        System.out.println("Resultant Matrix:");
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    } else {
	        System.out.println("Matrix multiplication is not possible.");
	    }
	}

}
