package JspiderMock2;

public class deleteDuplicate {
	public static String deletedup(String s) {
		s=s.replaceAll("\\s+", " ");
		String str="";
		boolean vis[]=new boolean [256];
		for(int i=0;i<s.length();i++) {
			
		 if(vis[s.charAt(i)]==false) {
				str+=s.charAt(i);
				vis[s.charAt(i)]=true;
			}
		}
		return str;
	}
	public static void main(String[] args) {
		
		  String s = "    progra       owihfuewybhjnfdwhiubef fq	uevjhw kwidbuifewkmming    ";

		    System.out.println("Original String: " + s);
		    System.out.println("After Removing Duplicates: " + deletedup(s));
	}

}
