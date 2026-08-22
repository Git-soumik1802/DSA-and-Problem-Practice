package jspiderPractice;

public class countWords {
	public static int countwords(String s) {
		s=s.trim();
		s=s.replaceAll("\\s+", " ");
		String str[]=s.split(" ");
		int n=str.length;
		return n;
	}
	public static void main(String[] args) {
		
		   String s = "   Java    is   an                              Object   Oriented   Language   ";
	        System.out.println("Number of words = " + countwords(s));
	}

}
