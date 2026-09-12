package GreedyProblems;

import java.util.*;

public class FractionalKnapsack {

    static class Item {
        int value, weight;
        double ratio;
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio=(double)value/weight;
        }
    }
   
    public static double knapsack(int[] values, int[] weights, int capacity) {
    	Item ratio[]=new Item[values.length];
    	
      double total=0;
      for(int i=0;i<ratio.length;i++) {
    	  ratio[i]=new Item(values[i],weights[i]);
      }
    	  Arrays.sort(ratio,(a,b)->Double.compare(b.ratio, a.ratio));
    	  for(int j=0;j<ratio.length;j++) {
    		  if(capacity>=ratio[j].weight) {
    			  total+=ratio[j].value;
    			  capacity-=ratio[j].weight;
    		  }else {
    			  total+=ratio[j].ratio*capacity;
    			  break;
    		  }
    	  }
      
     
     
      
        return total;
    }

    public static void main(String[] args) {

        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};

        int capacity = 50;

        System.out.println(knapsack(values, weights, capacity));
    }
}