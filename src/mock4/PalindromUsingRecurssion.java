package mock4;

public class PalindromUsingRecurssion {
	public static boolean palindrome(int n,int o, int r) {
		if(n==0)return o==r;
		return palindrome(n/10, o, r*10+(n%10));
	}
	public static void main(String[] args) {

        int n = 121;

        if (palindrome(n, n, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

	}

}
