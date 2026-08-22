package dsajspider;

public class removeduplicates {
	public static void removeduplicates(int []a) {
		for(int i=0;i<a.length;i++) {
			boolean b=true;
			for(int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					b=false;
					break;
				}
			}
			if(b) {
				System.out.print(a[i]+" 1");
			}
		}
		
		
	}
	public static void main(String[] args) {
		int []a= {4,3,2,1,2,3,5,4};
		removeduplicates(a);
	}

}
