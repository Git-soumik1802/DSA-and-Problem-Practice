package jspiderPractice;

public class binarytoDecimal {
	public static int binary(int n) {
		int pow=0;
		int binary=0;
		while(n>0) {
			int rem=n%10;
			binary+=(int)Math.pow(2, pow)*rem;
			n/=10;
			pow++;
		}
		
		return binary;
	}
	public static void main(String[] args) {
		 System.out.println(binary(1010)); // 10
	     System.out.println(binary(1111)); // 15
	     System.out.println(binary(1001)); // 9

	}

}
