package RaveeshMock;

public class mergeSort {
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
	}
	public static void sort(int a[]) {
		if(a.length<=1)return;
		int l[]=new int[a.length/2];
		int r[]=new int[a.length-l.length];
		for(int i=0;i<l.length;i++) {
			l[i]=a[i];
		}
		for(int i=0;i<r.length;i++) {
			r[i]=a[l.length+i];
		}
		sort(l);
		sort(r);
		merge(l,r,a);
	}
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};

	    System.out.println("Before Sorting:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }

	    sort(arr);

	    System.out.println("\nAfter Sorting:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}

}
