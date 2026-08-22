package PFQuestionsCodeChefs;

public class PF5 {

    public static void main(String[] args) {

    	String[] inArray = {
    		    "#FFfFFf",
    		    "#FF0000",
    		    "#fFFf0a",
    		    "#000000",
    		    "#887333"
    		};
        int brightCount = 0;
        int dullCount = 0;

        for (int i = 0; i < inArray.length; i++) {
            int fCount = 0;

            for (int j = 0; j < inArray[i].length(); j++) {
                char ch = inArray[i].charAt(j);

                if (ch == 'f' || ch == 'F') {
                    fCount++;
                }
            }

            if (fCount > 2) {
                brightCount++;
            } else {
                dullCount++;
            }
        }

        if (brightCount > dullCount) {
            System.out.println("BRIGHT-" + brightCount);
        } else {
            System.out.println("DULL-" + dullCount);
        }
    }
}
