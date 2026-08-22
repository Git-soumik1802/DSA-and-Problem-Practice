package PracticeSetPf;

public class PF3 {

    public static void main(String[] args) {
          String s="Banglore";
          System.out.println(s);
          String res="";
          for(int i=s.length()-1;i>=0;i--) {
        	  res+=s.charAt(i);
          }
          
          System.out.println(res);
    }
}

