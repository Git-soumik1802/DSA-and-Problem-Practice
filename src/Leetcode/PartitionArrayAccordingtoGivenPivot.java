package Leetcode;

import java.util.*;

public class PartitionArrayAccordingtoGivenPivot {

    public static int[] pivotArray(int[] nums, int pivot) {
    	int n=nums.length;
//    	int st=0;
//    	int end=n-1;
//    	int mid=(st+end)/2;
//    	
//        int []ans=new int[n];
//        for(int i=0;i<n;i++) {
//        	if(nums[i]==pivot) {
////        		System.out.println(i);
//        		int temp=nums[mid];
//        		nums[mid]=nums[i];
//        		nums[i]=temp;
//        		st=mid;
//        	}
//        }
//        
    	int k=0;
    	int []ans=new int[n];
    	for(int i=0;i<n;i++) {
    		if(nums[i]<pivot) {
    			ans[k]=nums[i];
    			k++;
    		}
    	}
    	for (int i=0;i<n;i++) {
    		if(nums[i]==pivot) {
    			ans[k]=nums[i];
    			k++;
    		}
    	}
    	for(int i=0;i<n;i++) {
    		if(nums[i]>pivot) {
    			ans[k]=nums[i];
    			k++;
    		}
    	}
    	
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter pivot: ");
        int pivot = sc.nextInt();

        int[] result = pivotArray(nums, pivot);

        System.out.println(Arrays.toString(result));
    }
}