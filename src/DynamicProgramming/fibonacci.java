package DynamicProgramming;
import java.util.Arrays;
public class fibonacci {
static int dp[];
	 public static int fib(int n) {
		 if(n<=1) {
			 return n;
		 }
		 if(dp[n]!=-1) {
			 return dp[n];
		 }
		 dp[n]=fib(n-1)+fib(n-2);
		 return dp[n];
	 }
	 public static int fiboTab(int n) {
		 dp[0]=0;
		 dp[1]=1;
		 for(int i=2;i<=n;i++) {
			 dp[i]=dp[i-1]+dp[i-2];
		 }
		 return dp[n];
	 }
	public static void main(String[] args) {
		 int n = 5;
	        dp = new int[n + 1];
	        Arrays.fill(dp, -1);
	        System.out.println(fib(n));
	        System.out.println(fiboTab(n));
	}
}
