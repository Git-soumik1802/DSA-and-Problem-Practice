package Leetcode;

import java.util.HashMap;

public class majorityElement169 {
	public static int majorityElement(int[] nums) {
		HashMap<Integer,Integer>hs=new HashMap();
		for(int i=0;i<nums.length;i++) {
			int cnt=1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					cnt++;
				}
			}
			if(hs.containsKey(nums[i])==false) {
				hs.put(nums[i], cnt);
			}
		}
		int max=Integer.MIN_VALUE;
		int ans=0;
		for(int n:hs.keySet() ) {
			if(hs.get(n)>max) {
				max=hs.get(n);
				ans=n;
			}
		}
		return ans; 
	}
	public static void main(String[] args) {
		 int[] nums = {2, 2, 1, 1, 1, 2, 2};

	        System.out.println(majorityElement(nums));

	}

}
