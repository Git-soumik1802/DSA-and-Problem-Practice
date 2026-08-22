package jspiderPractice;

public class FisrtnotRepeatingcharacter {
	public static char firstnotRepchar(String str) {
		str=str.toLowerCase();
		int freq[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				freq[ch-'a']++;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(freq[ch-'a']==1) {
					return ch;
				}
			}
		}
		return '0';
	}
	public static void main(String[] args) {
		 String str = "programpming";

	        char ans = firstnotRepchar(str);

	        if (ans != '\0')
	            System.out.println("First non-repeating character = " + ans);
	        else
	            System.out.println("No non-repeating character found");
	    }
	}


