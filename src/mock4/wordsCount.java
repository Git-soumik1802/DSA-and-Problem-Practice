package mock4;

public class wordsCount {
	public static void freqwords(String s) {
		String str[]=s.replaceAll("\\s+", " ").trim().split(" ");
		boolean vis[]=new boolean[str.length];
		
		for(int i=0;i<str.length;i++) {
			if(vis[i])continue;
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					vis[j]=true;
				}
			}
			System.out.println(str[i]+"->"+count);
		}
	}
	public static void main(String[] args) {
		
		 String s = "java is java is easy java";

		 freqwords(s);
	}

}
