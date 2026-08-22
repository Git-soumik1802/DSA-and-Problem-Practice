package JspiderMock2;

public class permutationofString {
	public static void permutation(String s,String newS) {
		if(s.length()==0) {
			System.out.println(newS);
			return ;
			
		}
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		String str=s.substring(0,i)+s.substring(i+1);
		permutation(str, newS+ch);
		}
	}
	public static void main(String[] args) {
		
		String str = "ABC";
        permutation(str, "");
	}

}
