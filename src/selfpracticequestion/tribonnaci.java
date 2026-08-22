package selfpracticequestion;

public class tribonnaci {
	public static int tribo(int n) {
		if(n==0||n==1)return 0;
		if(n==2)return 1;
		return tribo(n-1)+tribo(n-2)+tribo(n-3);
	}
public static void main(String[] args) {
	 int n = 10;

     for(int i = 0; i < n; i++) {
         System.out.print(tribo(i) + " ");
     }
}
}