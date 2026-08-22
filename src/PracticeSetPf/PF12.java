package PracticeSetPf;

public class PF12 {

    public static void main(String[] args) {

        String s = "Mississippi";
        String result = "";

       boolean found=false;
//       for(int i=0;i<s.length();i++) {
//    	   found=false;
//    	   char ch=s.charAt(i);
//    	   for(int j=0;j<i;j++) {
//    		   if(s.charAt(j)==ch) {
//    			   found =true;
//    			  
//    		   }
//    	   }
//    	   if(!found) {
//    		   result+=ch;
//    	   }
//       }
       for (int i = 0; i < s.length(); i++) {

    	    char ch = s.charAt(i);

    	    if (result.indexOf(ch) == -1) {
    	        result = result + ch;
    	    }
    	}

        System.out.println("After removing duplicates: " + result);
    }
}
