package recurssion;

public class printAllSubsequesnceofString {
	public static void subsequenceString(String s,int i,String newString) {
		if(i==s.length()) {
			System.out.println(newString);
			return ;
		}
		char ch=s.charAt(i);
		subsequenceString(s,i+1,newString+ch);//new substring with character add
		subsequenceString(s,i+1,newString);//new substring without character add
	}
	public static void main(String[] args) {
		String s="aaa";
		subsequenceString(s,0,"");

	}

}
