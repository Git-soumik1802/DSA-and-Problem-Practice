package RECURSION;

public class FirstAndLastOccur {
	public static int f=-1;
	public static int l=-1;
	public static void flOccur(int idx,char element,String s) {
		if(idx==s.length()) {
			System.out.println(f);
			System.out.println(l);
			return ;
		}
		char currchar=s.charAt(idx);
		if(currchar==element) {
			if(f==-1) {
				f=idx;
			}
			else {
				l=idx;
			}
		}
		flOccur(idx+1, element, s);
	}
	public static void main(String[] args) {
		  String s = "bacba";

	        char element = 'a';

	        flOccur(0, element, s);
	}

}
