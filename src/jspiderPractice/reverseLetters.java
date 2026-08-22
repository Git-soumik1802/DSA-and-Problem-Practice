package jspiderPractice;

public class reverseLetters {
	public static String reverseletters(String s) {
		String ans="";
		s=s.replaceAll("\\s+"," ").trim();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			for(int j=str[i].length()-1;j>=0;j--) {
				
				ans+=str[i].charAt(j);
				
			}
			ans+=" ";
		}
		
		return ans.trim();
	}
	public static void main(String[] args) {
		 String s = "   Java   is   an                        Object   Oriented   Language   ";

	        System.out.println("Original String : " + s);
	        System.out.println("Reversed Words  : " + reverseletters(s));

	}

}
