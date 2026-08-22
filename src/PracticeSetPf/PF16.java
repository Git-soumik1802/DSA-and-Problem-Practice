package PracticeSetPf;

public class PF16 {

    public static void main(String[] args) {

        String s = "abcabcbb";   

        boolean found;

        int maxLength=0;
		for (int i = 0; i < s.length(); i++) {

            String temp = "";

            for (int j = i; j < s.length(); j++) {

                found = false;

                for (int k = 0; k < temp.length(); k++) {

                    if (temp.charAt(k) == s.charAt(j)) {
                        found = true;
                        break;
                    }
                }

                if (found) break;

                temp += s.charAt(j);
                maxLength = Math.max(maxLength, temp.length());
            }
        }
        System.out.println("Longest substring length: " + maxLength);
    }
}
