package finalPractice;

public class quickSort {
	public static void sort(int a [],int st,int end) {
		int i=st;
		int j=end;
		int pivot=a[(st+end)/2];
		if(st>=end) {
			return ;
		}
		while(i<=j) {
			while(a[i]<pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,st,j);
		sort(a,i,end);
	}
	public static void main(String[] args) {
		
		int[] arr = {45, 12, 78, 4,3, 56, 91, 24, 67, 8, 39, 14, 82, 50, 29, 73, 5, 97, 18, 64, 41, 10, 88, 31, 60, 2, 76, 54, 20, 99, 7, 36, 85, 15, 70, 43, 26, 95, 11, 58, 33, 80, 1, 66, 22, 49, 90, 13, 62, 37, 100};

	    sort(arr,0,arr.length-1);

	    System.out.println("Sorted Array:");

	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}

}
