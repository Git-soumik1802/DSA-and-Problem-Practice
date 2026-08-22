package mock4;

public class longestSubstring {
	public static void longestsubstr(String str) {
		int freq[]=new int [256];
		int l=0;
		int ml=0;
		int s=0;
		for(int r=0;r<str.length();r++) {
			char ch=str.charAt(r);
			freq[ch]++;
			while(freq[ch]>1) {
				freq[str.charAt(l)]--;
				l++;
			}
			if (r - l + 1 > ml) {
                ml = r - l + 1;
                s = l;
            }
		}
		 System.out.println("Longest Length: " + ml);
	        System.out.println("Longest Substring: "
	                + str.substring(s, s + ml));
	}
	public static void main(String[] args) {
		 longestsubstr("abcabcbb");

	}

}
