package arrayProblems;
import java.util.Arrays;
public class moveallZeroestoend {
	public static int []moveZeroes(int []arr){
		int []ans=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]!=0) {
				ans[k]=arr[i];
				k++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 0, 3, 4, 0};
        int[] result = moveZeroes(arr);
        System.out.println(Arrays.toString(result));
	}
}
