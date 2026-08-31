package Leetcode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length + nums2.length];

        int n = res.length;

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            res[nums1.length + i] = nums2[i];
        }

        
        Arrays.sort(res);

        double median;

        if (n % 2 != 0) {
            median = res[n / 2];
        }

        
        else {
            median = (res[(n / 2) - 1] + res[n / 2]) / 2.0;
        }

        return median;
    }

    public static void main(String[] args) {

        MedianofTwoSortedArrays obj = new MedianofTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};

        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}