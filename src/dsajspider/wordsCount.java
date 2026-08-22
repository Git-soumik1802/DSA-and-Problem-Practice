package dsajspider;

public class wordsCount {

    public static void countWords(String s) {

        s=s.trim();
        s = s.replaceAll("\\s+", " ");
        int count=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(ch==' ') {
        		count++;
        	}
        }
        count=count+1;
        System.out.println("Words count: " + count);
    }

    public static void main(String[] args) {

        String s = "Java     is a programming     language";

        countWords(s);
    }
}