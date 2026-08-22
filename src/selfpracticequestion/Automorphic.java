package selfpracticequestion;

public class Automorphic {
	public static boolean automorphic(int n) {
		int sq=n*n;
		int temp=n;
		while(temp>0) {
			if(temp%10!=sq%10) {
				return false;
			}
			temp/=10;
			sq/=10;
		}
		return true;
	}
public static void main(String[] args) {
	  int n = 76;

      if (automorphic(n))
          System.out.println(n + " is an Automorphic Number");
      else
          System.out.println(n + " is not an Automorphic Number");
  }

}
