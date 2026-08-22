package JspiderMock2;

public class countWords {
	public static int count(String s) {
		int count=0;
		String str[]=s.replaceAll("\\s+", " ").trim().split(" ");
		count=str.length;
		return count;
	}
	public static void main(String[] args) {
		 String s = "   I     lo                 ve                                Java Programming   ";

	        int ans = count(s);

	        System.out.println("Number of words: " + ans);

	}

}
