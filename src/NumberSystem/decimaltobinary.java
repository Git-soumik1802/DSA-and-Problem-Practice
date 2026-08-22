package NumberSystem;

public class decimaltobinary {
	public static void dtoBinary(int n) {
		int ans = 0;
		int pow = 1;
		while (n > 0) {
			int rem = n % 2;
			n /= 2;
			ans += rem * pow;
			pow *= 10;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		dtoBinary(76);

	}

}
