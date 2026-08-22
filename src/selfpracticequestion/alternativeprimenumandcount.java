package selfpracticequestion;

public class alternativeprimenumandcount {
public static boolean isPrime(int n) {
	if(n<=1)return false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)return false;
	}
	return true;
}
	public static void main(String[] args) {
		int st=2 , end=50000000;
		int count=0;
		for(int i=st;i<=end;i++) {
			if(isPrime(i)) {
				count++;
			
			if(count%2!=0) {
				System.out.println(i);
				}
		}}
        System.out.println("Total Prime Numbers = " + count);

	}
	

}
