package finalPractice;

public class mergeSort {
	public static void merge(int a[],int l[],int r[]) {
		int i=0,j=0,k=0;
		while(i<l.length && j<r.length) {
			if(l[i]<r[j]) {
				a[k]=l[i];
				k++;
				i++;
			}
			else {
				a[k]=r[j];
				k++;
				j++;
			}
		}
		while(i<l.length) {
			a[k]=l[i];
			k++;
			i++;
		}
		while(j<r.length) {
			a[k]=r[j];
			k++;
			j++;
		}
	}
	public static void sort(int a[]) {
		int l[]=new int [a.length/2];
		int r[]=new int [a.length-l.length];
		if(a.length<=1) {
			return ;
		}
		for(int i=0;i<l.length;i++) {
			l[i]=a[i];
		}
		for(int i=0;i<r.length;i++) {
			r[i]=a[l.length+i];
		}
		sort(l);
		sort(r);
		merge(a,l,r);
	}
public static void main(String[] args) {
	int[] arr = {45, 12, 78, 3, 56, 91, 24, 67, 8, 39, 14, 82, 50, 29, 73, 5, 97, 18, 64, 41, 10, 88, 31, 60, 2, 76, 54, 20, 99, 7, 36, 85, 15, 70, 43, 26, 95, 11, 58, 33, 80, 1, 66, 22, 49, 90, 13, 62, 37, 100};

    sort(arr);

    System.out.println("Sorted Array:");

    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}
