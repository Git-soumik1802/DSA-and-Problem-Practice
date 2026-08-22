package jspiderPractice;

public class Decimaltobinary {
public static int decimal(int n) {
	int binary=0;
	int pow=1;
	while(n>0) {
		int rem=n%2;
		n/=2;
		binary+=pow*rem;
		pow*=10;
	}
	return binary;
}
	public static void main(String[] args) {
		

	}

}
