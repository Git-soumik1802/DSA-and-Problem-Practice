package DynamicProgramming1;

import java.util.Arrays;

public class MinCostClimbingStairs {
	  public static int minCostClimbingStairs(int[] cost) {
	        int n=cost.length;
	     int  dp[]=new int[n+1];
	        dp[0]=0;
	        dp[1]=0;
	        for(int i=2;i<=n;i++){
	            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
	        }
	        return dp[n];
	    }
	  public static int minCostClimbingStairswithoutDP(int cost[]) {
		  int n=cost.length;
		  int prev1=0;
		  int prev2=0;
		  for(int i=2;i<=n;i++) {
			  int curr=Math.min(prev1+cost[i-1], prev2+cost[i-2]);
			  prev2=prev1;
			  prev1=curr;
		  }
		  return prev1;
	  }
	  public static void main(String[] args) {
		  int[] cost = {1,100,1,1,1,100,1,1,100,1};

	        int result = minCostClimbingStairs(cost);
	        int res=minCostClimbingStairswithoutDP(cost);

	        System.out.println("Cost: " + Arrays.toString(cost));
	        System.out.println("Minimum Cost: " + result);
	        System.out.println("Cost: " + Arrays.toString(cost));
	        System.out.println("Minimum Cost: " + res);
	}

}
