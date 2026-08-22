package JspiderMock2;

public class spiralMatrix {
	public static void spiral(int a[][]) {
		int up=0;
		int down=a.length-1;
		int left=0;
		int right=a[0].length-1;
		while(up<=down && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(a[up][i]+" ");
				
			}
			up++;
			for(int i=up;i<=down;i++) {
				System.out.print(a[i][right]+" ");
				
			}
			right--;
			if(up<=down) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[down][i]+" ");
					
				}
				down--;
			}
			if(left<=right) {
				for(int i=down;i>=up;i--) {
					System.out.print(a[i][left]+" ");
					
				}
				left++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
		        {1, 2, 3, 4},
		        {5, 6, 7, 8},
		        {9, 10, 11, 12},
		        {13, 14, 15, 16}
		    };

		    spiral(a);
	}

}
