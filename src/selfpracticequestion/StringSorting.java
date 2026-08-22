package selfpracticequestion;

import java.util.Arrays;

public class StringSorting {

    public static void sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c));
    }

    public static void main(String[] args) {
        sort("programming");   // aggimmnoprr
    }
}