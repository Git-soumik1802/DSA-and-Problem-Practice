package PracticeSetPf;

public class PF25 {

    public static void main(String[] args) {

        String input = "HelloWorld";
        String result = "";

       for(int i=0;i<input.length();i++) {
    	   char ch=input.charAt(i);
    	 
    	   ch=(char) (ch+2);
    	  
    	   result+=ch;
       }
       System.out.println(result);
    }
}
