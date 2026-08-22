package StringQuestions;

public class LongestSubstring {

    public static int longestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int[] freq = new int[256];

        int left = 0;

        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            freq[ch]++;

            while (freq[ch] > 1) {

                freq[s.charAt(left)]--;

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(longestSubstring("abcabcbb"));
    }
}