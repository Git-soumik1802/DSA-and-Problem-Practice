package patternmatch;

public class starprint19 {

	public static void starprint(int n) {

		for(int i = n; i >= 1; i--) {

			for(int j = 1; j <= (2 * n - 1); j++) {

				if(i == n || j == n - i + 1 || j == n + i - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		starprint(5);

	}
}