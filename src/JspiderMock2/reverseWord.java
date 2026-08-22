package JspiderMock2;

public class reverseWord {
	public static String reverse(String s) {
		String ans="";
		String str[]=s.replaceAll("\\s+", " ").trim().split(" ");
		for(int i=0;i<str.length;i++ ) {
			for(int j=str[i].length()-1;j>=0;j--) {
				ans+=str[i].charAt(j);
			}
			ans+=" ";
		}
		return ans.trim();
	}
	public static void main(String[] args) {
	    String s = "Hello Java World";

        System.out.println(reverse(s));

	}

}
