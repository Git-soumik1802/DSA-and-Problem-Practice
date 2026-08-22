package StringQuestions;

public class StringCompression {

    public static String compress(String s) {

        String ans = "";

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;

            } else {

                ans += s.charAt(i) + "" + count;

                count = 1;
            }
        }

        
        ans += s.charAt(s.length() - 1) + "" + count;

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(compress("aaabbc"));
    }
}