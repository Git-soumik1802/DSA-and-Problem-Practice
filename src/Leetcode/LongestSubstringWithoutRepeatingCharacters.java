package Leetcode;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            String str = "";
            for(int j = i; j < arr.length; j++) {
                str += arr[j];
                System.out.println(str);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
    	

    	    java.util.Scanner sc = new java.util.Scanner(System.in);

    	    String s = sc.nextLine();

    	    lengthOfLongestSubstring(s);
    	
    }
}
