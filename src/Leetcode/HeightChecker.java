package Leetcode;

import java.util.Arrays;

public class HeightChecker {
	public static int heightChecker(int[] heights) {
		int count=0;
		int expected[]=Arrays.copyOf(heights, heights.length);
		System.out.println(Arrays.toString(expected));
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		heightChecker(arr);
	}

}
