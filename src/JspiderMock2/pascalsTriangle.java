package JspiderMock2;
public class pascalsTriangle {
public static void triangle(int n) {
	int a[][]=new int [n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			if(j==0||j==i) {
				a[i][j]=1;;
			}else {
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print(a[i][k]+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		 int n = 5;
	        triangle(n);

	}

}
