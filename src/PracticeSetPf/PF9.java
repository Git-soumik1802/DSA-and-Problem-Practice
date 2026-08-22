package PracticeSetPf;

public class PF9 {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        boolean isAnagram=true;
        if(s1.length()!=s2.length()) {
        	isAnagram=false;
        }
        int []count=new int [256];
        for(int i=0;i<s1.length();i++) {
        	count[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++) {
        	count[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram) {
        	System.out.println("this is anagram");
        }
        else {
        	System.out.println("this is Not");
        }
    }
}

