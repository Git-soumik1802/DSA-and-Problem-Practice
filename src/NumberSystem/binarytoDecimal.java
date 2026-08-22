package NumberSystem;

public class binarytoDecimal {

	public static void main(String[] args) {
		btoDecimal(101010);

	}

	private static void btoDecimal(int n) {
		int ans = 0;
		int p = 0;

		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			ans = (int) (ans + rem * Math.pow(2, p)); 
			p++;
		}
		System.out.println(ans);

	}

}
