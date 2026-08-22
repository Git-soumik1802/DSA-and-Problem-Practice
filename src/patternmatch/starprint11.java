package patternmatch;

import java.util.Scanner;

public class starprint11 {
	public static void startprint(int n) {
		
		   for(int i=n;i>=1;i--) {
			   for(int j=1;j<=n;j++) {
				   if(j>=i) {
					   System.out.print("*");
				   }
				   else {
					   System.out.print(" ");
				   }
				   
			   }
			   System.out.println();
			   
		   }  
		}
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			    int n = sc.nextInt();
			    startprint(n);
		}
}
