package Leetcode;

public class reverseWordInString {
	public static String reverseWords(String s) {
        String str[]=s.replaceAll("\\s+"," ").split(" ");
        String word=" ";
        for(int i=str.length-1;i>=0;i--) {
        	word+=str[i]+" ";
        }
        return word.trim();
    }
	public static void main(String[] args) {
		  String s = "the sky is blue";

	        System.out.println(reverseWords(s));

	}

}
