package practiceforMock;

public class characterOccurance {
	public static void countcharacter(String s) {
		int freq[]=new int [256];
		boolean vis[]=new boolean [256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			freq[ch]++;
			}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(vis[ch]==false) {
				System.out.println(ch+"="+freq[ch]);
				vis[ch]=true;
			}
		}
	}
	public static void main(String[] args) {
		  String s = "banana";
	        countcharacter(s);

	}

}
