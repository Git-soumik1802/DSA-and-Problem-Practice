package jspiderPractice;

public class permutationoftring {
	public static void permutation(String s,String p) {
		if(s.length()==0) {
			System.out.println(p);
			return ;
		}
		for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 String newStr=s.substring(0,i)+s.substring(i+1);
			 permutation(newStr, p+ch);
		}
	}
	public static void main(String[] args) {
		String str = "ABCHGHK";
        permutation(str, "");
	}
}
