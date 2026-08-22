package arrayProblems;

import java.util.*;

public class LeaderElements {

    public static int[] leaders(int[] arr) {

       ArrayList<Integer>l=new ArrayList<>();
      
      int n=arr.length;
      l.add(arr[n-1]);
      int maxEle=arr[n-1];
      for(int i=n-2;i>=0;i--) {
    	  if(arr[i]>maxEle) {
    		  maxEle=arr[i];
    		  l.add(arr[i]);
    	  }
      }
      Collections.reverse(l);
      int[] ans = new int[l.size()];

      int k = 0;

      for (Integer num : l) {
          ans[k] = num;
          k++;
      }

       return ans;
    }

    public static void main(String[] args) {

    	 int[] arr = {17, 15, 4, 3, 5, 2};

         int[] result = leaders(arr);

         System.out.println(Arrays.toString(result));
    }
}