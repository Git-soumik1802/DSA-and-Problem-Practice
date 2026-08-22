package JspiderMock2;

public class transposeMatrix {
	public static int[][] transpose(int a[][]){
		int r=a.length;
		int c=a[0].length;
		int b[][]=new int[c][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[j][i]=a[i][j];
			}
		}
		return b;
	}
	public static void main(String[] args) {
		 int a[][] = {
		            {1, 2, 3},
		            {4, 5, 6}
		    };

		    int ans[][] = transpose(a);

		    System.out.println("Transpose Matrix:");

		    for (int i = 0; i < ans.length; i++) {
		        for (int j = 0; j < ans[0].length; j++) {
		            System.out.print(ans[i][j] + " ");
		        }
		        System.out.println();
		    }

	}

}
