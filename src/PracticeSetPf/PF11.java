package PracticeSetPf;

public class PF11 {

    public static void main(String[] args) {

        String s = "management";   

        int maxCount = 0;
        char result = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;

      
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == ch) {
                    count++;
                }
            }

           
            if (count > maxCount || 
               (count == maxCount && ch < result)) {

                maxCount = count;
                result = ch;
            }
        }

        System.out.println("Most frequent character: " + result);
    }
}
