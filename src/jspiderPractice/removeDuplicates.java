package jspiderPractice;

public class removeDuplicates {
	public static String removedup(String s) {
		boolean vis[]=new boolean [256];
		
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(vis[ch]==false) {
				ans+=ch;
				vis[ch]=true;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		 String str = "prograNKUYTREWDSXCVBNKJYHGFDXCVmming";

	        String result = removedup(str);

	        System.out.println("Original String : " + str);
	        System.out.println("After Removing Duplicates : " + result);
	}

}
