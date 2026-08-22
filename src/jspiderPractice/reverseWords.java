package jspiderPractice;

public class reverseWords {
	public static String reversewords(String s) {
		String ans="";
		s=s.replaceAll("\\s+", " ").trim();
		String str[]=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			ans+=str[i]+" ";
		}
		return ans.trim();
	}

	public static void main(String[] args) {
		 String s = "   Java   is   an                        Object   Oriented   Language   ";

	        System.out.println("Original String : " + s);
	        System.out.println("Reversed Words  : " + reversewords(s));
	}
}
