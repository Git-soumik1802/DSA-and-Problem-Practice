package PracticeSetPf;

import java.util.Scanner;

public class PF2 {

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int n=str.length();
       int sum=0;
       for(int i=0;i<n;i++) {
    	   char ch=str.charAt(i);
    	   int a=ch;
    	   sum+=a;
       }
//       System.out.println(sum);
       if(sum%20==0) {
    	   System.out.println(sum);
       }
       else {
    	   System.out.println("NA");
       }
    }
}
