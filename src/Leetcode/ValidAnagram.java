package Leetcode;

public class ValidAnagram {
	public static boolean isAnagram(String s,String t) {
		int count[]=new int [256];
		if(s.length()!=t.length()) {
			return false;
		}
		
		else{
			for(int i=0;i<s.length();i++) {
				count[s.charAt(i)]++;
			}
			for(int i=0;i<s.length();i++) {
				count[t.charAt(i)]--;
			}
			for(int i=0;i<count.length;i++) {
				if(count[i]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
