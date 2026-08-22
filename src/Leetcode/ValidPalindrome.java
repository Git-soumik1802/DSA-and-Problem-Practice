package Leetcode;

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
    	int n=s.length();
    	String str="";
    	for(int i=0;i<n;i++) {
    		char ch=s.charAt(i);
    		if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
    			str+=ch;
    		}
    	}
//    	System.out.println(str);
    	str=str.toLowerCase();
    	String []arr=str.split("");
    	int left=0;
    	int right=arr.length-1;
    	while(left<right) {
    		if(!arr[left].equals(arr[right])) {
    			return false;
    		}
    		left++;
    		right--;
    	}
    	
    	
		return true;

        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));

        sc.close();
    }
}