package mock4;

public class diagonalsSum {
	public static int sum(int a[][]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int j=a.length-i-1;
			sum+=a[i][i];
			if(i!=j) {
				sum+=a[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Diagonal Sum = " + sum(a));

	}

}
