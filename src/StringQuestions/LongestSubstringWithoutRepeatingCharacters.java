package StringQuestions;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            boolean vis[]=new boolean [256];
            for(int j=i;j<s.length();j++){
                if(vis[s.charAt(j)])break;
                vis[s.charAt(j)]=true;
                max=Math.max(max,j-i+1);
            }
            
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
