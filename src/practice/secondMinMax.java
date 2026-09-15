package practice;

public class secondMinMax {
	public static void  secondMaxMin(int a[]) {
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		  for (int i = 0; i < a.length; i++) {

	          
	            if (a[i] > max) {
	                max2 = max;
	                max = a[i];
	            } 
	            else if (a[i] > max2 && a[i] != max) {
	                max2 = a[i];
	            }

	            
	            if (a[i] < min) {
	                min2 = min;
	                min = a[i];
	            } 
	            else if (a[i] < min2 && a[i] != min) {
	                min2 = a[i];
	            }
	        }
		System.out.println(min2);
		System.out.println(max2);
	}
	public static void main(String[] args) {
		  int a[] = {10, 5, 20, 8, 20, 3, 5};

	        secondMaxMin(a);

	}

}
