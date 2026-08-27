package RECURSION;

public class PrintSum {
	public static int  Sum(int i,int n,int sum) {
		if(i==n) {
			return sum;
		}
		sum+=i;
		return Sum(i+1,n,sum);
	}
	public static void main(String[] args) {
        int sum = Sum(1, 11, 0);

        System.out.println(sum);
        
	}

}
