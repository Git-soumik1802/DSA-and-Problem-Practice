package NumberSystem;

public class automorphic {
	public static void  automorphicN(int n) {
		
		int help=n*n;
		int temp=n;
		while(temp >0) {
			if(temp%10!=help%10) {
				System.out.println("it's not a automorphic");
				return ;
			}
			temp/=10;
			help/=10;
		}
		System.out.println("it's a automorphic");
		
	}
	public static void main(String[] args) {
		automorphicN(7);

	}

}
