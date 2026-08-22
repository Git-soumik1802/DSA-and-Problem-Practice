package arrayProblems;

import java.util.Arrays;

public class productOfElements {
	public static int []productArray(int []a){
		int[] ans=new int [a.length];
		int []prefix=new int [a.length];
		int []suffix=new int [a.length];
		prefix[0]=1;
		for(int i=1;i<a.length;i++) {
			prefix[i]=prefix[i-1]*a[i-1];
		}
		suffix[a.length-1]=1;
		for(int i=a.length-2;i>=0;i--) {
			suffix[i]=suffix[i+1]*a[i+1];
		}
		 for (int i = 0; i < a.length; i++) {
	            ans[i] = prefix[i] * suffix[i];
	        }

		return ans;
	}
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4};

	        int[] result = productArray(arr);

	        System.out.println(Arrays.toString(result));

	}

}
