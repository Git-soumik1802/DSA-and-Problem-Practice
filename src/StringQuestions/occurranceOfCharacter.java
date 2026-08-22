package StringQuestions;

public class occurranceOfCharacter {
	public static void frequency(String s ) {
		s=s.toLowerCase();
		char []ch=s.toCharArray();
		int []n=new int [26];
		
		for(int i=0;i<ch.length;i++) {
			
if(ch[i]>='a' && ch[i]<='z' ) {
	n[ch[i]-'a']++;
}		
			}
		for(int i=0;i<n.length;i++) {
			if(n[i]>0) {
				System.out.println((char)(i+'a')+"-"+n[i]);
			}
		}
		
	
	}
	public static void main(String[] args) {
	     frequency("jkdbhjwqbhfqwertyuioplkmnbvcxzasdfghjklkjhgfdsazxcvbnmklpoiuytrewqasdfghjhgnhgfjHYUYTGFGfniwebfkbwehf");

	}

}
