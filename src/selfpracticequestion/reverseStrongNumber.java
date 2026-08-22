package selfpracticequestion;

public class reverseStrongNumber {
public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	if(n==1) {
		return 1;
	}
	return n*fact(n-1);
}
public static boolean reverseStrongNum(int n) {
	int rev=reverse(n);
	int temp=rev;
	int sum=0;
	while(temp>0) {
		sum+=fact(temp%10);
		temp/=10;
	}
	return sum==rev ;
}
public static int reverse(int n) {
	int ans=0;
	
	while(n>0) {
		ans=ans*10+n%10;
		n/=10;
	}
	return ans;
}
public static void main(String[] args) {
	 int n = ;

     if (reverseStrongNum(n)) {
         System.out.println(n + " is a  reversed Strong Number");
     } else {
         System.out.println(n + " is not reversed a Strong Number");
     }
}
}
