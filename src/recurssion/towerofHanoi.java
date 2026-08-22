package recurssion;

public class towerofHanoi {

	public static void toH(int n, String src, String help, String dest) {

		if (n == 1) {

			System.out.println("Transfer disk 1 from " + src + " to " + dest);
			return;

		}

		// step 1

		toH(n - 1, src, dest, help);
		// step 2
		System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

		// step 3
		toH(n - 1, help, src, dest);
	}

	public static void main(String[] args) {

		int n = 6;

		toH(n, "S", "H", "D");

	}
}
