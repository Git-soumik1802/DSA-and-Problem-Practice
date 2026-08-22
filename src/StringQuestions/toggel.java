package StringQuestions;

public class toggel {
	public static String toggel(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z') {
				ans+=(char)(ch+32);
			}
			else if(ch>='A' && ch<='Z') {
				ans+=(char)(ch-32);
			}
			else {
				ans+=ch;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		System.out.println(toggel("JaVa ProGram"));

	}

}
