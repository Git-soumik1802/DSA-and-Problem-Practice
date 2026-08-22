
package recurssion;

import java.util.HashSet;

public class uniqueSubsequence {
	public static void subsequenceString(String s, int i, String newString, HashSet<String> set) {
		if (i == s.length()) {
			if (set.contains(newString)) {
				return;
			} else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char ch = s.charAt(i);
		subsequenceString(s, i + 1, newString + ch, set);// new substring with character add
		subsequenceString(s, i + 1, newString, set);// new substring without character add
	}

	public static void main(String[] args) {
		String s = "aaa";
		HashSet<String> set = new HashSet<>();
		subsequenceString(s, 0, "", set);

	}

}