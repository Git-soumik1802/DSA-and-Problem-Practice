package mock3;

public class countWords {
	public static int count(String s) {
	    if (s == null || s.trim().isEmpty()) {
            return 0;
        }
		int c=0;
		s=s.replaceAll("\\s+", " ").trim();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		return c+1;
	}
	public static void main(String[] args) {
	      String str = "   Java    is   very   easy   ";

	        System.out.println("Number of words = " + count(str));

	}

}
