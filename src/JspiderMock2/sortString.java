package JspiderMock2;

public class sortString {
	public static String sort(String s) {
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int min=i;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[min]) {
					min=j;
				}
			}
			char temp=ch[i];
			ch[i]=ch[min];
			ch[min]=temp;
		}
		return String.valueOf(ch);
	}
public static void main(String[] args) {
	String s = "programming";

    System.out.println("Original String: " + s);
    System.out.println("Sorted String: " + sort(s));
}
}
