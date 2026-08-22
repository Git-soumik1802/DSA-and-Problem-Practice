package jspiderPractice;

public class longestsubstring {

	public static void main(String[] args) {
		 System.out.println(longestSubstring("abcadbcbb"));
		 
	}

	public static String longestSubstring(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			String temp="";
			for(int j=i;j<str.length();j++) {
				char ch=str.charAt(j);
				if(temp.contains(String.valueOf(ch))) {
					break;
				}
				temp+=ch;
				if(temp.length()>ans.length()) {
					ans=temp;
				}
			}
			
		}
		return ans;
	}

}
