package mock3;

public class occuranceOfWords {
	public static void occurWord(String s) {
		s=s.replace("\\s+", " ").trim();
		String words[]=s.split(" ");
		boolean vis[]=new boolean[words.length];
		for(int i=0;i<words.length;i++) {
			if(vis[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					vis[j]=true;
				}
			}
			 System.out.println(words[i] + " : " + count);
		}
		
	}
	public static void main(String[] args) {

        String s = "java is easy java is powerful";

        occurWord(s);

	}

}
