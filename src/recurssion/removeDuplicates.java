package recurssion;

public class removeDuplicates {
	public static boolean[]map=new boolean[26];
	public static void removedup(String s,int i,String newstr) {
	if(s.length()==i) {
		System.out.println(newstr);
		return ;
	}
		char ch=s.charAt(i);
		int idx=ch-'a';
		if(map[idx]==true) {
			removedup(s, i+1, newstr);
		}
		else {
			map[idx]=true;
			removedup(s, i+1, newstr+ch);
			
		}
	}
	public static void main(String[] args) {
		String s = "abbccda";

        removedup(s, 0, "");

	}

}
