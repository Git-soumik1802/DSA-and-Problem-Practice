package dsajspider;
public class maximumOccurance {
    public static void maxOccurance(String s) {
        int[] count=new int[s.length()];
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++) {
            int co=1;

            if(ch[i]==' ') {
                continue;
            }

            for(int j=i+1;j<ch.length;j++) {
                if(ch[i]==ch[j]) {
                    co++;
                    ch[j]=' ';
                }
            }

            count[i]=co;
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<count.length;i++) {
            if(count[i]>max) {
                max=count[i];
            }
        }
        for(int i=0;i<count.length;i++) {
            if(count[i]<min && count[i] > 0) {
                min=count[i];
            }
        }
        for(int i=0;i<count.length;i++) {
            if(count[i]==max && ch[i]!=' ') {
                System.out.println(ch[i]+" -> "+count[i]);
            }
        }
        for(int i=0;i<count.length;i++) {
            if(count[i]==min && ch[i]!=' ') {
                System.out.println(ch[i]+" -> "+count[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        String s="programming";
        maxOccurance(s);
    }
}