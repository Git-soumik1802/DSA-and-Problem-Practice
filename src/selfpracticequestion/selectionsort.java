package selfpracticequestion;

public class selectionsort {
	public static int []sort(int []a){
		for(int i=0;i<a.length;i++) {
			int minI=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minI]) {
					minI=j;
				}
			}
			int temp=a[i];
			a[i]=a[minI];
			a[minI]=temp;
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
