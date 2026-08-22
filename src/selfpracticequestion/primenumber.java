package selfpracticequestion;

import java.util.Arrays;
import java.util.Scanner;

public class primenumber {
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []p=new int[n];
	for(int i=0;i<n;i++) {
	p[i]=sc.nextInt();
	}
	int[]res=new int[n];
	int k=0;
	for(int i=0;i<n;i++) {
		if(isprime(p[i])) {
			res[k++]=p[i];
		}
	}
	System.out.println(Arrays.toString(res));
	}
}
