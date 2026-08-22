package dsajspider;
public class characterOccurance {
    public static void occuranceCount(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
        if(ch[i]==' ') {
        	continue;
        }
        for(int j=i+1;j<ch.length;j++) {
        	if(ch[i]==ch[j]) {
        		count++;
        		ch[j]=' ';
        	}
        }
            System.out.println(ch[i] + " -> " + count);
        }
    }
    public static void main(String[] args) {
        String s = "programming";
        occuranceCount(s);
    }
}