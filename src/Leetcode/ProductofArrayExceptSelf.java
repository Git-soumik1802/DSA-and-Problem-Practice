package Leetcode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int []ans=new int[nums.length];
       ans[0]=1;
       for(int i=1;i<nums.length;i++) {
    	   ans[i]=ans[i-1]*nums[i-1];
       }
       int suffix = 1;

		for(int i=nums.length-1;i>=0;i--) {

			ans[i] = ans[i] * suffix;

			suffix = suffix * nums[i];
		}
        
		return ans;
        
    }

	public static void main(String[] args) {

		ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();

		int[] nums = {1,2,3,4};

		System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
	}

}
