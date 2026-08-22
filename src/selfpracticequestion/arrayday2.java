package selfpracticequestion;

import java.util.Scanner;

public class arrayday2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int []a=new int[n];
	int m=s.nextInt();
	int []b=new int[m];
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	for(int i=0;i<m;i++) {
		b[i]=s.nextInt();
	}
	//odd sum even sum
	int osum=0;
	int esum=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			esum+=a[i];
		}
		osum+=a[i];
	}
	}
	System.out.println(esum+", "+osum);

}
