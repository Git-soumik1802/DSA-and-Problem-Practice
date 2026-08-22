package jspiderPractice;

public class amstrongNumber {
	public static boolean amstrongNum(int n) {
		int temp=n;
		int count=0;
		while(temp>0) {	
			temp/=10;
			count++;
		}
		int sum=0;
		int temp1=n;
		while(n>0) {
			sum=(int)Math.pow(n%=10,count);
			n/=10;
		}
		
		if(sum==temp1) return true;
		
		return false;
	}
	public static void main(String[] args) {
		
System.out.println(amstrongNum(153));
	}

}
