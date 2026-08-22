package mock4;

import java.util.*;

public class topKFrequent {

    public static int[] topkfreq(int a[], int k) {

       int res[]=new int[k];
       Map<Integer,Integer>count=new HashMap();
       for(int i:a) {
    	   count.put(i, count.getOrDefault(i, 0)+1);
       }
       PriorityQueue<Integer> pq = new PriorityQueue<>(
               (x, y) -> count.get(x) - count.get(y)
           );
       for (int x : count.keySet()) {

           pq.add(x);

           if (pq.size() > k) {
               pq.poll();
           }
       }

       // Store answer
       for (int i = k - 1; i >= 0; i--) {
           res[i] = pq.poll();
       }

       return res;
    }

    public static void main(String[] args) {

        int a[] = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int ans[] = topkfreq(a, k);

        System.out.println(Arrays.toString(ans));
    }
}