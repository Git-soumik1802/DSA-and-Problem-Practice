package jspiderPractice;

import java.util.HashSet;

public class removeDuplicatesDigits {
	public static int []removeDuplicates(int a[]){
		HashSet<Integer>hs=new HashSet();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		int ans[]=new int[hs.size()];
		 int index=0;
		for(int n:hs) {
			ans[index++]=n;
		}
		return ans;
	}
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 2, 4, 1, 5};

		    int[] result = removeDuplicates(arr);

		    for (int num : result) {
		        System.out.print(num + " ");
		    }

	}

}
