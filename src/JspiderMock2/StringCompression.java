package JspiderMock2;

public class StringCompression {
	public static String compress(String s) {
		int freq[]=new int[256];
		boolean vis[]=new boolean[256];
		String ans="";
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++) {
			if(vis[s.charAt(i)]==false) {
				ans+=s.charAt(i);
				if(freq[s.charAt(i)]>1) {
					ans+=freq[s.charAt(i)];
				}
				vis[s.charAt(i)]=true;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		   System.out.println(compress("aaabbcaaacccdd"));

	}

}
