package arrayProblems;

import java.util.Arrays;
import java.util.TreeSet;

public class removeduplicateFromsortedArray {

//    public static int[] remove_duplicated(int[] arr) {
//
//     int j=0;
//     for(int i=1;i<arr.length;i++) {
//    	 if(arr[i]!=arr[j]) {
//    		 j++;
//    		 arr[j]=arr[i];
//    	 }
//     }
//     int[]ans=new int[j+1];
//     for (int i = 0; i <= j; i++) {
//         ans[i] = arr[i];
//     }
//return ans;
//    }
	public static int[] remove_duplicated(int[] arr) {
		Arrays.sort(arr);
		TreeSet<Integer>ts=new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			ts.add(arr[i]);
		}
		int []ans=new int[ts.size()];
		int k=0;
		for(Integer num:ts) {
			ans[k]=num;
			k++;
		}
		return ans ;
		
	}

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int[] result = remove_duplicated(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
