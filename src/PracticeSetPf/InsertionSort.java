package PracticeSetPf;

public class InsertionSort {
	public static int []sort(int[]a){
		for(int i=1;i<a.length;i++) {
			int prev=i-1;
			int curr=a[i];
			while(prev>=0 && a[prev]>curr ) {
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
		return a;
	}
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 3};

        arr = sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


	}

}
