package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class findMissingAndRepeatedValues {
	public static int[] findArray(int a[][]) {
		
		int n=a.length;
		HashMap<Integer,Integer>hs=new HashMap();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int num=a[i][j];
					hs.getOrDefault(num, hs.getOrDefault(num,0)+1);
				}
			}
			
			int rep=0;
			int mis=0;
			for(int i=1;i<n*n;i++) {
				if(hs.getOrDefault(i, 0)==2) {
					rep=i;
				}
				if(hs.getOrDefault(i, 0)==0) {
					mis=i;
				}
			}
			int b[]= {rep,mis};
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
