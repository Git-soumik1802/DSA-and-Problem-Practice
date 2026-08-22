package mock4;

import java.util.ArrayList;

public class leadingElements {
	public static int [] leadingele(int a[]) {
		ArrayList<Integer> l=new ArrayList();
		for(int i=0;i<a.length;i++) {
			boolean lead=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					lead=false;
				}
			}
			if(lead==true) {
				l.add(a[i]);
			}
		}
		int ans[]=new int[l.size()];
		for(int i=0;i<ans.length;i++) {
			ans[i]=l.get(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] a = {16, 17, 4, 3, 5, 2};

	    int[] ans = leadingele(a);

	    for (int x : ans) {
	        System.out.print(x + " ");
	    }

	}

}
