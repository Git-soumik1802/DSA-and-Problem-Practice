package practiceforMock;

public class removeDuplicates {
public static void  removedup(int a[],int idx) {
	if(idx==a.length-1) {
		System.out.println(a[idx]);
		return ;
	}
	if(a[idx]!=a[idx+1]) {
		System.out.println(a[idx]);
	}
	removedup(a, idx+1);
}
	public static void main(String[] args) {
		  int[] a = {1, 1, 2, 2, 3, 3, 4, 5, 5};

	        removedup(a, 0);

	}

}
