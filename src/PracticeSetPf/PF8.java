package PracticeSetPf;

public class PF8 {
  public static void main(String[] args) {
	String s="Learning";
	s=s.toUpperCase();
	String res="";
	for(int i=s.length()-1;i>=0;i--) {
		res+=s.charAt(i);
	}
	System.out.println(res);
}
}
