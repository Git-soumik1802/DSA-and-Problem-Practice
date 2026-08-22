package DSA;

public class LongestuniqSubstring {

    public static String longestUniqueSubstring(String s) {
        int maxl = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                char cur = s.charAt(j);
                int count = 0;
                if (temp.indexOf(cur) == 0) {
                    count++;
                }
                if (count > 0) {
                    break;
                }
                temp += cur;
                if (temp.length() > maxl) {
                    maxl = temp.length();
                    res = temp;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcdaxyzabcjkab";
        System.out.println(longestUniqueSubstring(str));
    }
}