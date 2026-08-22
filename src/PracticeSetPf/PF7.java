package PracticeSetPf;

public class PF7 {

    public static void main(String[] args) {

        String s = "Karnataka";   // Sample input
        String res="";
        int n=s.length();
        
        for(int i=0;i<n;i++) {
        	char ch=s.charAt(i);
        	if(ch=='a') {
        		res+='@';
        	}
        	else {
        		res+=ch;
        	}
        }
        System.out.println(res);
    }
}
