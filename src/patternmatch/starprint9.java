package patternmatch;

import java.util.Scanner;

public class starprint9 {
	public static void startprint(int n) {
		int col=1;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=col;j++) {
				   if(i==j||i==n||j==1) {
					   System.out.print("* ");
			   }
				   else {
	                    System.out.print("  ");
	                }
			   }
			   System.out.println();
			   col++;
		   }  
		}
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			    int n = sc.nextInt();
			    startprint(n);
		}
}
