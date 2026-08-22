package PracticeSetPf;

public class PF13 {

    public static void main(String[] args) {

        String s = "soumik";  
        boolean isUnique = true;

        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	for(int j=i+1;j<s.length();j++) {
        		if(ch==s.charAt(j)) {
        			isUnique=false;
        			break;
        		}
        	}
        	if(!isUnique) {
        		break;
        	}
        }
        if(isUnique) {
        	System.out.println("All characters are unique");
        }
        else {
        	System.out.println("Characters are not unique");
        }
    }
}
