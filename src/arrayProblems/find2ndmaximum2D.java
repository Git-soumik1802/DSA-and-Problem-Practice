package arrayProblems;

public class find2ndmaximum2D {

	public static void main(String[] args) {
		 int[][] a = {
	                {10, 20, 30},
	                {40, 5, 60},
	                {7, 80, 9}
	        };

	        int ans = find2ndMax(a);

	        System.out.println("Maximum Element: " + ans);
	}

	private static int find2ndMax(int[][] a) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>max1) {
					max2=max1;
					max1=a[i][j];
				}
				if(a[i][j]>max2 && a[i][j]!=max1) {
					max2=a[i][j];
				}
			}
		}
		return max2;

	}

}
