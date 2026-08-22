package PracticeSet;

import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(int a[],int target) {
		int res[]=new int [2];
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					res[0]=a[i];
					res[1]=a[j];
					return res;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,90,1};
		int target=11;
		System.out.println(Arrays.toString(twoSum(arr,target)));
	}
}