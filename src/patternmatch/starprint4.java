package patternmatch;

import java.util.Scanner;

public class starprint4 {
	public static void startprint(int n) {

		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				   if(i%2!=0||j==1) {
					   System.out.print("* ");
				   }
				   else {
					   System.out.print("  ");
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
