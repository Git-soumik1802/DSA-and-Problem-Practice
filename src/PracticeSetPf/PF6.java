package PracticeSetPf;

public class PF6 {

    public static void main(String[] args) {

        String s = "developer";   // Input string
         int n=s.length();
         for(int i=0;i<n;i++) {
        	 char ch=s.charAt(i);
        	 int count =0;
        	 for(int j=0;j<n;j++) {
        		 if(s.charAt(j)==ch) {
        			 count++;
        		 }
        	 }
        	 if(count==1) {
        		 System.out.println(ch);
        		 break;
        	 }
         }
      
    }
}

