package StringQuestions;

public class countWordsinSentence {
	public static int countWord(String s) {
		s=s.replaceAll("\\s+", " ");
		s=s.trim();
		String []str=s.split(" ");
		int n=str.length;
		
		return n;
	}
	public static String longestWord(String s) {
		s=s.replaceAll("\\s+", " ");
		s=s.trim();
		int max=Integer.MIN_VALUE;
		String []str=s.split(" ");
		int n=str.length;
		String ans="";
		for(int i=0;i<n;i++) {
			if(max<str[i].length()) {
				max=str[i].length();
				ans=str[i];
			}
		}

		return ans;
	}
	public static void main(String[] args) {
		String s = "Java is a powerful programming language";

        System.out.println(countWord(s));

        System.out.println(longestWord(s));

	}

}
