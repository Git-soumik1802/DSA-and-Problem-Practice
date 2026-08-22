package PracticeSetPf;

public class PF1 {

    public static void main(String[] args) {

      String s="Mysore";
      String result="";
      for(int i=0;i<s.length();i++) {
    	  char ch=s.charAt(i);
    	  if(ch!='A' && ch!='a' && ch!='E' && ch!='e' && ch!='I' && ch!='i' && ch!='O' && ch!='o' && ch!='U' && ch!='u') {
    		  result+=ch;
    	  }
      }
      System.out.println(result);
    }
}
