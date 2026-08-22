package mock4;

public class secondmaxmin {
	public static void secondMinMax(int a[][]) {
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]<min1) {
					min2=min1;
					min1=a[i][j];
					
				}
				else if(a[i][j]<min2 && a[i][j]!=min1) {
					min2=a[i][j];
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>max1) {
					max2=max1;
					max1=a[i][j];
					
				}
				else if(a[i][j]>max2 && a[i][j]!=max1) {
					max2=a[i][j];
				}
			}
		}
		System.out.println("Minimum = " + min1);
        System.out.println("Second Minimum = " + min2);
        System.out.println("Maximum = " + max1);
        System.out.println("Second Maximum = " + max2);
	}
	public static void main(String[] args) {
		
		int[][] a = {
			    {5, 8, 2},
			    {10, 1, 7},
			    {6, 9, 4}
			};

			secondMinMax(a);
	}

}
