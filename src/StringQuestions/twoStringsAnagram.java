package StringQuestions;

public class twoStringsAnagram {
	public static boolean isAnagram(String s, String t) {
		int []n=new int [26];
		if (s.length() != t.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				n[ch-'a']++;
			}
			
		}
		for (int i = 0; i < t.length(); i++) {
			char ch=t.charAt(i);
			if(ch>='a' && ch<='z') {
				n[ch-'a']--;
			}
		}
		for(int i=0;i<n.length;i++) {
			if(n[i]!=0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		 String s1 = "listen";
	        String s2 = "silent";

	        System.out.println(isAnagram(s1, s2));

	}

}
