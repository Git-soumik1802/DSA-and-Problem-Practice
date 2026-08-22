package practiceforMock;

public class mergeSort {
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(a.length>i && b.length>j) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(a.length>i) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(b.length>j) {
			c[k]=b[j];
			j++;
			k++;
		}
	}
	public static void sort(int a[]) {
		int left[]=new int [a.length/2];
		int right[]=new int [a.length-left.length];
		if(a.length<=1) {
			return ;
		}
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=a[left.length+i];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
		
	}
	public static void main(String[] args) {

		 int[] a = {5, 1, 4, 2, 8};

	     sort(a);

	     for (int num : a) {
	         System.out.print(num + " ");

	}
	}

}
