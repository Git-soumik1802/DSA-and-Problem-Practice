package NumberSystem;

public class DecimalBinaryPalindrome {

    public static void main(String[] args) {
        int num = 10;

        if (isDecimalPalindrome(num) && isBinaryPalindrome(num)) {
            System.out.println(num + " is a Decimal and Binary Palindrome");
        } else {
            System.out.println(num + " is NOT a Decimal and Binary Palindrome");
        }
    }

    public static boolean isDecimalPalindrome(int num) {
       int temp=num;
       int rev=0;
       while(temp>0) {
    	   rev=rev*10+temp%10;
    	   temp/=10;
       }
       if(rev==num) {
    	   return true;
       }
       return false;
    }

    public static boolean isBinaryPalindrome(int num) {
       
    int temp=num;
    String binary="";
    while(temp>0) {
    	binary=temp%2+binary;
    	temp/=2;
    }
    int i=0;
    int j=binary.length()-1;
    while(i<j) {
    	if(binary.charAt(i)!=binary.charAt(j)) {
    		return false;
    	}
    	i++;
    	j--;
    }
return true;
    }
}
