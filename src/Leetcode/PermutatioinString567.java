package Leetcode;

import java.util.ArrayList;

public class PermutatioinString567 {

    public static ArrayList<String> permutation(String str) {

        ArrayList<String> result = new ArrayList<>();

        if (str.length() == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            ArrayList<String> smallAns = permutation(remaining);

            for (String s : smallAns) {
                result.add(ch + s);
            }
        }

        return result;
    }

    public static boolean checkInclusion(String s1, String s2) {

        ArrayList<String> permutations = permutation(s1);

        for (String str : permutations) {

            if (s2.contains(str)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}