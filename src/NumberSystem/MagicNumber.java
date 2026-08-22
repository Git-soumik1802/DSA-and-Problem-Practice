package NumberSystem;

public class MagicNumber {

	public static void main(String[] args) {

		magicNum(1729);
	}

	private static void magicNum(int n) {

		int sum = 0;

		while (n > 0) {

			sum += n % 10;
			n /= 10;
		}

		while (sum > 9) {

			int temp = sum;
			sum = 0;

			while (temp > 0) {

				sum += temp % 10;
				temp /= 10;
			}
		}

		if (sum == 1) {
			System.out.println("it's magic number");
		} else {
			System.out.println("it is not magic number");
		}
	}
}