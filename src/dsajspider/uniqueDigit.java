package dsajspider;

public class uniqueDigit {
	public static void uniqueD(int[]a) {
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 4, 1, 5};

        uniqueD(a);
	}

}
