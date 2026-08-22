package StringQuestions;

public class removeDuplicateChars {
	public static void removeDup(String s) {
		boolean[]visit=new boolean[26];
		String str="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(visit[ch-'a']==false) {
					str+=ch;
					visit[ch-'a']=true;
				}
			}
			
			
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		removeDup("lkewjfbwjkfuberbbehcbue");

	}

}
