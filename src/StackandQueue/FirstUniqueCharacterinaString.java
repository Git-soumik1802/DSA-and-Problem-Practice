package StackandQueue;

import java.util.*;

public class FirstUniqueCharacterinaString {

    public static int firstnonRepeatingIndex(String s) {

        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[256];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Add characters to queue
        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }

        // Find first non-repeating character
        while (!q.isEmpty()) {

            char ch = q.remove();

            if (freq[ch] == 1) {
                return s.indexOf(ch);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "aabbcdde";

        System.out.println(firstnonRepeatingIndex(s));
    }
}