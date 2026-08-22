package mock4;

public class anagram {
	public static boolean anagram(String s,String t) {
		int freq[]=new int[256];
		if(s.length()!=t.length()) {
			return false;
		}
		if(s.length()==t.length()) {
			for(int i=0;i<s.length();i++) {
				freq[s.charAt(i)]++;
			}
			for(int i=0;i<s.length();i++) {
				freq[t.charAt(i)]--;
			}
			for(int i=0;i<freq.length;i++) {
				if(freq[i]!=0)return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		  System.out.println(anagram("listen", "silent"));
	        System.out.println(anagram("hello", "world"));
	        System.out.println(anagram("race", "care"));

	}

}
