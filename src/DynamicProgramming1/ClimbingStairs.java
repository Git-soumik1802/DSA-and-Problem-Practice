package DynamicProgramming1;

public class ClimbingStairs {
	 static int dp[];
	public static int stairs(int n) {
		dp=new int [n+1];
		dp[0]=1;
		
		if(n>=1) {
			dp[1]=1;
		}
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
		
	}
	public static void main(String[] args) {
		   System.out.println(stairs(10));

	}

}
