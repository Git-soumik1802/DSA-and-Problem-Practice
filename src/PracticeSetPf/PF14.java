package PracticeSetPf;

public class PF14 {

    public static void main(String[] args) {

        String s = "hello123world456";   // Sample input

        String temp = "";
        int sum=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(ch>='0' && ch<='9') {
        		temp+=ch;
        	}
         }
        for(int i=0;i<temp.length();i++) {
        	char ch=temp.charAt(i);
        	int n=ch-'0';
        	sum+=n;
        }
        System.out.println(sum);
    }
}
