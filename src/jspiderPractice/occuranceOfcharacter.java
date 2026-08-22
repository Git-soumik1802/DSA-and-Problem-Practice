package jspiderPractice;

public class occuranceOfcharacter {

	public static void main(String[] args) {
		 frequency("jkdbhjwqbhfqwertyuioplkmnbvcxzASDFGHJKLKREWSXKUYTREASJNBVFKasdfghjklkjhgfdsazxcvbnmklpoiuytrewqasdfghjhgnhgfjHYUYTGFGfniwebfkbwehf");

	}

	public static void frequency(String str) {
		int freq[]=new int [256];
		boolean vis[]=new boolean[256];
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			freq[ch]++;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(vis[ch]==false) {
			System.out.println(str.charAt(i)+": "+freq[ch]);
			vis[ch]=true;
			}
		}
		
	}

}
