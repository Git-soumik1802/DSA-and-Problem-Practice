package practiceforMock;

public class quicksort {
	public static void sort(int a[],int st,int end) {
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
		 int[] a = {5, 1, 4, 2, 8};

	     sort(a,0,a.length-1);

	     for (int num : a) {
	         System.out.print(num + " ");

	}

	}

}
