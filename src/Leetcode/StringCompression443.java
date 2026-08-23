package Leetcode;

public class StringCompression443 {
	public static int compress(char[] chars){
		String ans="";
		for(int i=0;i<chars.length;i++) {
			int count=1;
			 while (i + 1 < chars.length &&
	                    chars[i] == chars[i + 1]) {

	                count++;
	                i++;
	            }

	            ans = ans + chars[i];

	            if (count > 1) {
	                ans = ans + count;
	            }
	        }

	        char ch[] = ans.toCharArray();

	        // Copy answer back into original array
	        for (int i = 0; i < ch.length; i++) {
	            chars[i] = ch[i];
	        }

	        return ch.length;
	}
	public static void main(String[] args) {
		 char[] chars = {
		            'a', 'a', 'b', 'b', 'c', 'c', 'c'
		        };

		        int length = compress(chars);

		        System.out.println(length);

		        
	}

}
