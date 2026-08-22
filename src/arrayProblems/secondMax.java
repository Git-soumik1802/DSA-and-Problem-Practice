package arrayProblems;

public class secondMax {
	public static int secMax(int []a) {
		int max2=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
				if(a[i]>max2 && a[i]!=max1) {
					max2=a[i];
				}
			}
		}
		return max2;
	}
	public static void main(String[] args) {
		  int[] arr = {4, 7, 1, 9, 2};
		int ans=secMax(arr);
		 System.out.println("Maximum element is: " + ans);

	}

}
