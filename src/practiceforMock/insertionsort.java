package practiceforMock;

public class insertionsort {
	public static void sort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
public static void main(String[] args) {
	 int[] a = {5, 1, 4, 2, 8};

     sort(a);

     for (int num : a) {
         System.out.print(num + " ");

}
}
}
