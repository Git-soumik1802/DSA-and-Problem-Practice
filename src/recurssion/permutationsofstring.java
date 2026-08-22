package recurssion;

public class permutationsofstring {
	public static void permutation( String str,String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return ;
		}
		for(int i=0;i<str.length();i++) {
		char ch =str.charAt(i);
		String newstr=str.substring(0,i)+str.substring(i+1);
		permutation(newstr,permutation+ch);
		}
	}
	public static void main(String[] args) {
		  String str = "ABC";
	        permutation(str, "");

	}

}
