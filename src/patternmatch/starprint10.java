package patternmatch;

import java.util.Scanner;

public class starprint10 {

	public static void startprint(int n) {
		
		int col=n;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n-i+1;j++) {
				   if(i==1||j==1||i+j==n+1) {
				   
					   System.out.print("*");
			   }else {
				   System.out.print(" ");
			   }
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
