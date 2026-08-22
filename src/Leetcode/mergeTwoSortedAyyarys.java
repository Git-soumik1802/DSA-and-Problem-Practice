package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoSortedAyyarys {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        ArrayList<Integer> l1=new ArrayList();
	        
	        for(int i=0;i<m;i++){
	           
	                l1.add(nums1[i]);
	            
	        }
	        for(int i=0;i<n;i++){
	           
	                l1.add(nums2[i]);
	            
	        }
	        
	        int res[]=new int[l1.size()];
	        for(int i=0;i<l1.size();i++){
	            res[i]=l1.get(i);
	        }
	        Arrays.sort(res);
	        for(int i=0;i<res.length;i++){
	        	 nums1[i] = res[i];
	        }
	    }
	public static void main(String[] args) {
		 int[] nums1 = {1, 2, 3, 0, 0, 0};
	        int m = 3;

	        int[] nums2 = {2, 5, 6};
	        int n = 3;

	        merge(nums1, m, nums2, n);

	        System.out.println(Arrays.toString(nums1));

	}

}
