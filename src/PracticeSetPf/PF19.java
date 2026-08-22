package PracticeSetPf;

public class PF19 {

    public static void main(String[] args) {

        String s = "statistics";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;

            if (s.indexOf(ch) == i) {

          
                for (int j = 0; j < s.length(); j++) {

                    if (s.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " = " + count);
            }
        }
    }
}
