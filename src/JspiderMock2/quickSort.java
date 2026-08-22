package JspiderMock2;

public class quickSort {
	public static void quickSort(int a[],int low,int high) {
		if (low >= high) {
		    return;
		}
		int i=low;
		int j=high;
		int pivot=a[(high+low)/2];
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
		quickSort(a,low,j);
		quickSort(a,i , high);
	}
	public static void main(String[] args) {
		  int a[] = {8, 3, 1, 6, 2, 7, 5, 4};

	        quickSort(a, 0, a.length - 1);

	        for (int num : a) {
	            System.out.print(num + " ");
	        }

	}

}
