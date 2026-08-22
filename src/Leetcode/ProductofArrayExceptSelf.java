package Leetcode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int product=1;
        	for(int j=0;j<nums.length;j++) {
        		if(i==j) {
        			continue;
        		}
        		product*=nums[j];
        		
        	}
        	ans[i]=product;
        	
        }
		return ans;
        
    }

	public static void main(String[] args) {

		ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();

		int[] nums = {1,2,3,4};

		System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
	}

}
