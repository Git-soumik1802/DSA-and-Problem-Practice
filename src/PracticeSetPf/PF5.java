package PracticeSetPf;

public class PF5 {

    public static void main(String[] args) {

        String s = "Technology";
       s=s.toLowerCase();
       int count =0;
       int count1=0;
      for(int i=0;i<s.length();i++) {
    	  char ch=s.charAt(i);
    	     if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
    		  count++;
    		  
    	  }
    	     else {
    	    	 count1=s.length()-count;
    	     }
      }
      System.out.println("V count-"+count);
      System.out.println("C count-"+count1);  
    }
}

