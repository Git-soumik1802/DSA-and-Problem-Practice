package Leetcode;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) {
			return "";
		}
		
		String s = "";
		for (int j = 0; j < strs[0].length(); j++) {
			char ch = strs[0].charAt(j);
			for (int i = 1; i < strs.length; i++) {
				if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
					return s;
				}
			}
			s = s + ch;
		}
		return s;
	}

	public static void main(String[] args) {
		
		String[] strs = { "flower", "flow", "flight" };
		String result = longestCommonPrefix(strs);
		System.out.println(result);
	}
}