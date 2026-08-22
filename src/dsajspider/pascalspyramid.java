package dsajspider;

public class pascalspyramid {

	public static int[][] pascalPyramid(int n) {

		int[][] a = new int[n][];

		for (int i = 0; i < a.length; i++) {

			a[i] = new int[i + 1];

			for (int j = 0; j < a[i].length; j++) {

				if (j == 0 || j == i) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
			}
		}

		return a;
	}

	public static void main(String[] args) {

		int n = 6;

		int[][] a = pascalPyramid(n);

		for (int i = 0; i < a.length; i++) {

			// spaces
			for (int s = 0; s < a.length - i; s++) {
				System.out.print("  ");
			}

			// numbers
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "   ");
			}

			System.out.println();
		}
	}
}