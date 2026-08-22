package PracticeSetPf;

public class selectionsort {
	public static int[]sort(int []arr){
		
		
		for(int i=0;i<arr.length;i++) {
			int minI=i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minI]) {
					minI=j;
				}
							}
			int temp=arr[i];
			arr[i]=arr[minI];
			arr[minI]=temp;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		 int[] arr = {5, 2, 8, 1, 3};

	        arr = sort(arr);

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	}

}
