package PFQuestionsCodeChefs;

import java.util.Scanner;

public class PF1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
        	int index=-1;
        	String s1="";
        	int count=0;
            String s = scanner.next();
            	for(int i=0;i<s.length()-3;i++) {
            		s1=s.substring(i,i+3);
            		
          		char ch=s1.charAt(0);
          		char ch1=s1.charAt(1);
          		char ch2=s1.charAt(2);
           		if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') && 
           				(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') &&
           				(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')) {
          			count++;		
          		}
            		
            	}
            if(count<1) {
            	System.out.println("sad");
            }
            else {
            	System.out.println("Happy");
            }
        }
    }
}
