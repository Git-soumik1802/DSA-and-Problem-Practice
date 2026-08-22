package arrayProblems;
import java.util.*;
public class primenumfind {
    public static boolean checkprime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return checkprime(n, i + 1);
    }

public static int primenum(int []arr) {
	
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
	    if(checkprime(arr[i],2)) {
	    	list.add(arr[i]);
	    }
	}
	
	return list.get(1);
}
	public static void main(String[] args) {
		  int[] arr = {4, 5, 7, 8, 11};

	        int ans = primenum(arr);

	        System.out.println(ans);

	}

}
