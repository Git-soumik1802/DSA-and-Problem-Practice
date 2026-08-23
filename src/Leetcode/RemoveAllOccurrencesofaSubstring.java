package Leetcode;

public class RemoveAllOccurrencesofaSubstring {
	String str="";
	String res="";
	 public static String removeOccurrences(String s, String part) {
		while(s.contains(part)) {
			int idx=s.indexOf(part);
			s=s.substring(0,idx)+s.substring(idx+part.length());
		}
	        return s;
	    }
	public static void main(String[] args) {
	    String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s, part));

	}

}
