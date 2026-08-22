package NumberSystem;

public class NeonNumber {

	public static void neon(int n) {

		int help = n * n;
		int sum = 0;

		while (help > 0) {

			int rem = help % 10;
			sum += rem;
			help /= 10;
		}

		if (sum == n) {
			System.out.println("it's a neon number");
		} else {
			System.out.println("it's not a neon number");
		}
	}

	public static void main(String[] args) {

		neon(9);

	}
}
