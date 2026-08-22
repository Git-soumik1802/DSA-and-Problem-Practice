package recurssion;

public class countAllx {
	public static void moveX(String s,int i ,int count, String newstr ) {
		if(i==s.length()) {
			for(int j=0;j<count;j++) {
				newstr+='x';
			}
			System.out.println(newstr);
			return ;
		}
		char ch=s.charAt(i);
		if(ch=='x') {
			count++;
			moveX(s,i+1,count,newstr);
		}
		else {
			newstr+=ch;
			moveX(s,i+1,count,newstr);
		}
	}
	public static void main(String[] args) {
		
		 String s = "axbcxxd";

	        moveX(s, 0, 0, "");
	}

}
