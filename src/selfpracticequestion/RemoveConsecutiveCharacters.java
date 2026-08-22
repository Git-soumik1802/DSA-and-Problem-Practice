package selfpracticequestion;

public class RemoveConsecutiveCharacters {

	public static String removeConsecutive(String s) {
		if (s.length() == 0)
			return s;
		String ans = "";
		ans += s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				ans += s.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "aabbccdaa";
		System.out.println(removeConsecutive(s));
	}
}