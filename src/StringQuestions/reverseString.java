package StringQuestions;

public class reverseString {
public static String reverseWords(String s ) {
	s = s.replaceAll("\\s+", " ").trim();
    String[] str = s.split(" ");
    String ans = "";
    for (int i = str.length - 1; i >= 0; i--) {
        ans += str[i];
        if (i != 0) {
            ans += " ";
        }
    }
	return ans;
}
	public static void main(String[] args) {
        System.out.println(reverseWords("Java is awesome"));

	}

}
