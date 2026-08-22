package patternmatch;

public class starprint21 {

	public static void starprint(int n) {

		for(int i = 1; i <= n; i++) {

			for(int j = 1; j <= (2 * n - 1); j++) {

				if(i <= n / 2 + 1) {

					if(j >= n - i + 1 && j <= n + i - 1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}

				}
				else {

					if(j >= i && j <= (2 * n - i)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		starprint(5);

	}
}