package recurssion;

public class calpower {
	public static int cal(int x,int n) {
		if(x==0)return 0;
		if(n==0)return 1;
		return x*cal(x,n-1);
	}
	public static void main(String[] args) {
		int x=2;
		int n=5;
		System.out.println(cal(x,n));
	}

}
