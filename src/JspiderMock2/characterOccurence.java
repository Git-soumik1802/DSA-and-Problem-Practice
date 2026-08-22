package JspiderMock2;

public class characterOccurence {
	public static void freq(String s ) {
		int count[]=new int [256];
		boolean vis[]=new boolean [256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		
			if(vis[ch]==false) {
				System.out.println(ch+"->"+count[ch]);
				vis[ch]=true;
			}
		}
		
	}
	public static void main(String[] args) {
		 freq("progr      ilwjqfubwf    KSJHEUHJBWamming");

	}

}
