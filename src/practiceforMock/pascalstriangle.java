package practiceforMock;

public class pascalstriangle {
	public static void pascalstriangle(int n) {
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(j==0||i==j) {
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args) {

		 int n = 6;
	        pascalstriangle(n);
	}

}
