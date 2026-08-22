package PracticeSetPf;

public class PF10 {

    public static void main(String[] args) {

        String s = "abc123xyz456";   
        String res="";
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++) {
        	char ch=s.charAt(i);
        	if(ch>='0' && ch<='9') {
        		int x=ch-'0';
        		sum+=x;
        	}
        }
        System.out.println(sum);
//        int x=Integer.parseInt(res);
//        int sum=0;
//        while(x>0) {
//        	int digit=x%10;
//        	sum+=digit;
//        	x=x/10;
//        }
//        System.out.println(sum);
    }
}

