package recurssion;

public class keypadCombination {
	public static String[] keypad={".","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void combinations(String str,int idx,String combination) {
		if(idx==str.length()) {
			System.out.println(combination);
			return;
		}
		char currchar=str.charAt(idx);
		String mapping=keypad[currchar-'0'];
		for(int i=0;i<mapping.length();i++) {
			combinations(str, idx+1, combination+mapping.charAt(i));
		}
	}
	public static void main(String[] args) {

		String str="2376";

		combinations(str,1,"");
		

	}

}
