package NumberSystem;

public class palindrom {
	public static boolean palin(int n,int o,int r) {
		if(n==0)return o==r;
		return palin(n/10,o,r*10+(n%10));
	}
	public static void main(String[] args) {
		  int num = 123;

	        System.out.println(palin(num, num, 0));

	}

}
