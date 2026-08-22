package recurssion;

public class firstandlastoccurance {
	public static int first=-1;
	public static int last=-1;
	public static void flocur(String s,int i,char ele) {
		if(s.length()==i) {
			System.out.println(first);
			System.out.println(last);
			return ;
		}
		char ch=s.charAt(i);
		if(ch==ele) {
			if(first==-1) {
				first=i;
			}
			last=i;
		}
		flocur(s, i+1, ele);
	}
	

	public static void main(String[] args) {
		
		 String s = "daefaah";
	        char ele = 'a';
	        flocur(s, 0, ele);
	}

}
