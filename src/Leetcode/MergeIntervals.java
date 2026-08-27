package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	public static int[][] merge(int[][] intervals) {
		ArrayList<int[]>res=new ArrayList<>();
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
		int start=intervals[0][0];
		int end=intervals[0][1];
		for(int i=1;i<intervals.length;i++) {
			if(end>=intervals[i][0]) {
				end=Math.max(end,intervals[i][1]);
			}
			else {
				res.add(new int[] {start,end});
				start=intervals[i][0];
				end=intervals[i][1];
			}
		}
		res.add(new int[] {start,end});
		return res.toArray(new int[res.size()][]);
	
	    }

	public static void main(String[] args) {
		 int[][] intervals = {
			        {1, 3},
			        {2, 6},
			        {8, 10},
			        {15, 18}
			    };

			    int[][] result = merge(intervals);

			    for (int[] pair : result) {
			        System.out.println(Arrays.toString(pair));
			    }
	}

}
