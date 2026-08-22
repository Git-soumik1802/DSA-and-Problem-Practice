package dsajspider;

public class diagonalsum {
	public static int diagonalsum(int[][]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j||i+j==a.length-1) {
					sum+=a[i][j];
				}
			}
		}
		return sum;
	}
	public static int diagonalsum1(int[][]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i][i];
			if(i!=a.length-1-i) {
				sum+=a[i][a.length-1-i];
			}
		}
	return sum;
	}
	 public static void main(String[] args) {

	        int[][] a = {
	                {1,2,3},
	                {4,5,6},
	                {7,8,9}
	        };

	        System.out.println(diagonalsum(a));
	    }

}
