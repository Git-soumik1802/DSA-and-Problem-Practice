package selfpracticequestion;

public class bubblesort {
	public  static int []sort(int[]a){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		return a;
	}
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 3};

        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
