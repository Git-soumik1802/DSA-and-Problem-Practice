package dsajspider;

import java.util.Arrays;

public class leaderdigit {

	public static void main(String[] args) {
	int []a= {5,16,9,10,5,4};
	int n=a.length;
	int []res=new int [n];
	int k=0;
	for(int i=1;i<n;i++) {
		if(a[i-1]>a[i]) {
			res[k]=a[i-1];
			k++;
		}
	}
	res[k]=a[n-1];
	for(int i=0;i<k+1;i++) {
		System.out.print(res[i]+" ");
	}
	
	}

}
