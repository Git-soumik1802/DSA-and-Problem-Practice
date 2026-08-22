package mock3;
public class mergeSort {
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;	
			}
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
	}
	public static void sort(int a[]) {
		if(a.length<=1) {
			return ;
		}
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
		  int a[] = {8, 3, 5, 1, 9, 6, 2, 7};
		    sort(a);
		    for (int i = 0; i < a.length; i++) {
		        System.out.print(a[i] + " ");
		    }
	}
}
