package Leetcode;

import java.util.Scanner;

public class replaceDigits {

    public static String replaceDigitsMethod(String s) {
    	String res="";
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(Character.isAlphabetic(ch)) {
    			res+=ch;
    		}
    		else {
    			res+=(char)(s.charAt(i-1)+s.charAt(i)-'0');
    		}
    	}
      return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = replaceDigitsMethod(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}
