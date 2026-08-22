package recurssion;

public class moveallX {

    public static void moveallX(String s, int idx, int count, String newStr) {

        if (idx == s.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char ch = s.charAt(idx);

        if (ch == 'x') {
            moveallX(s, idx + 1, count + 1, newStr);
        } else {
            moveallX(s, idx + 1, count, newStr + ch);
        }
    }

    public static void main(String[] args) {
        String s = "axbcxxd";
        moveallX(s, 0, 0, "");
    }
}