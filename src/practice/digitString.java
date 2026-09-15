package practice;

public class digitString {

	public static void main(String[] args) {
		  String s = "abc123def456";

	        String result = getDigitString(s);

	        System.out.println(result);

	}

	public static String getDigitString(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}

}
