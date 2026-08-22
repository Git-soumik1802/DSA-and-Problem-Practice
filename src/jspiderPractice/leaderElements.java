package jspiderPractice;

import java.util.*;

	public class leaderElements {
		public static int []leadingDigits(int a[]){
			ArrayList<Integer>l=new ArrayList();
			for(int i=0;i<a.length;i++) {
				boolean leader=true;
				for(int j=i+1;j<a.length;j++) {
					if(a[j]>a[i]) {
						leader=false;
						
					}
				}
				if(leader==true) {
					l.add(a[i]);
				}
			}
			int ans[]=new int [l.size()];
			for(int i=0;i<l.size();i++) {
				ans[i]=l.get(i);
			}
			return ans;
	}

	public static void main(String[] args) {
		 int[] arr = {15, 14, 4, 3, 5, 2};

		    int[] result = leadingDigits(arr);

		    System.out.println("Leader Elements:");

		    for (int i = 0; i < result.length; i++) {
		        System.out.print(result[i] + " ");
		    }
	}

}
