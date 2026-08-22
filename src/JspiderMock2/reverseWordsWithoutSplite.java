package JspiderMock2;

public class reverseWordsWithoutSplite {
	public static String reverse(String s) {
		String temp="";
		String ans="";
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)!=' ') {
				temp=s.charAt(i)+temp;
			}
			else {
				ans=ans+temp+" ";
				temp="";
			}
			i++;
		}
		ans+=temp;
		return ans;
	}
	public static void main(String[] args) {
		 String s = "Java is easy";
	        System.out.println(reverse(s));
	}

}
