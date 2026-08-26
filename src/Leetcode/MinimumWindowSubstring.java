package Leetcode;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        String window = "";

        if (s.length() < t.length()) {
            return "";
        }

        int mapS[] = new int[256];
        int mapT[] = new int[256];

        // Store frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            mapT[t.charAt(i)]++;
        }

        int right = 0;
        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int minSt = 0;

        for (; right < s.length(); right++) {

            // Add current right character to window
            mapS[s.charAt(right)]++;

            // If current window contains t
            while (contains(mapS, mapT)) {

                if (right - left + 1 < minLen) {

                    minLen = right - left + 1;
                    minSt = left;
                }

                // Remove left character
                mapS[s.charAt(left)]--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(minSt, minSt + minLen);
    }

    public static boolean contains(int mapS[], int mapT[]) {

        for (int i = 0; i < 256; i++) {

            if (mapS[i] < mapT[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}