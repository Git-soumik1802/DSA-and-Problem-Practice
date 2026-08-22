package PracticeSetPf;

public class PF15 {
	   public static void main(String[] args) {
		   String s = "Hello World from Java";  
		  String temp="";
		  String ans="";
		   for(int i=0;i<s.length();i++) {
			   char ch=s.charAt(i);
			   if(ch!=' ') {
				   temp+=ch;
			   }
			   else {
				   ans=temp+" "+ans;
				   temp="";
			   }
		   }
		   ans=temp+" "+ans;
		   System.out.println(ans.trim());
	}
}
