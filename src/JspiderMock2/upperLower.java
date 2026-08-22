package JspiderMock2;

public class upperLower {
	public static void change(String s) {
		String str="";
				for(int i=0;i<s.length();i++ ) {
					char ch=s.charAt(i);
					if(Character.isUpperCase(ch)) {
						str+=Character.toLowerCase(ch);
					}
					else {
						str+=Character.toUpperCase(ch);
					}
					
				}
				System.out.println(str);
	}
	public static void main(String[] args) {
		
		  change("AbCdEf");
	}

}
