package RECURSION;

public class ReverseOfSring {
	public static void reverse(String str,int idx) {
		if(idx<0)return;
		System.out.println(str.charAt(idx));
		reverse(str,idx-1);
	}
	public static void main(String[] args) {

        String str = "hello";

        reverse(str, str.length() - 1);

	}

}
