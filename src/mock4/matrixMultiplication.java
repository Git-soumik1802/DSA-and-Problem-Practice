package mock4;

public class matrixMultiplication {
	public static void multi(int a[][],int b[][]) {
		int r1=a.length;
		int c1=a[0].length;
		int r2=b.length;
		int c2=b[0].length;
		int c[][]=new int [r1][c2];
		if(c1==r2) {
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<c1;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			
		}
		else {
			System.out.println("not possible");
		}
		System.out.println("Result Matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        multi(a, b);

	}

}
