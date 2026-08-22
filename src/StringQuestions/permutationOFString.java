package StringQuestions;

public class permutationOFString {
	public static void combinations(String a,int i,String newStr) {
		if(i==a.length()) {
			System.out.println(newStr);
			return ;
		}
		char ch=a.charAt(i);
		combinations(a, i+1, newStr+ch);
		combinations(a, i+1, newStr);
	}
	public static void main(String[] args) {
		 combinations("abc", 0, "");
	}

}
