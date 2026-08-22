package patternmatch;

import java.util.Scanner;

public class starprint8 {
	public static void startprint(int n) {
		int col=n;
		   for(int i=col;i>=1;i--) {
			   for(int j=1;j<=col;j++) {
				   
					   System.out.print("*");
			   }
			   System.out.println();
			   col--;
		   }  
		}
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			    int n = sc.nextInt();
			    startprint(n);
		}
}
