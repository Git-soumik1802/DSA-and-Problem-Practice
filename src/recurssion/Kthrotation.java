package recurssion;

import java.util.Arrays;

public class Kthrotation {
	public static void reverse(int []a,int st,int end) {
		while(st<end) {
			int temp=a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
			
		}
		
	}
	public static int []rotate(int []a,int k){
		int n=a.length;
		reverse(a,0,n-1);
		reverse(a,0,k-1);
		reverse(a,k,n-1);
		return a;
	}
	public static void main(String[] args) {
		   int[] arr = {1, 2, 3, 4, 5};

	        int k = 2;

	        int[] result = rotate(arr, k);

	        System.out.println(Arrays.toString(result));
	}

}
