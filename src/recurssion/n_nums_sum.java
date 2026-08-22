package recurssion;

public class n_nums_sum {
	public static void sum(int i,int n,int sum) {
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return ;
		}
		sum+=i;
		sum(i+1,n,sum); 
	}
	public static void main(String[] args) {
		int i=1;
		int n=100;
		int sum=0;
		sum(i,n,sum);

	}

}
