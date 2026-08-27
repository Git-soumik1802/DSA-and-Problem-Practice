package StringQuestions;

public class Findfirstnonrepeatedcharacter {
	public static void firstNonRepeatingChars(String s) {
		
		int[]freq=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') {
				freq[ch-'a']++;
			}
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') {
			if(freq[ch-'a']==1) {
				System.out.println(ch);
				return ;
			}
		}
		}
	}
	public static void main(String[] args) {
		firstNonRepeatingChars("aabbdde");

	}

}
