package finalPractice;

import java.util.ArrayList;

public class leadingElement {
	public static int[]leading(int a[]){
		ArrayList<Integer>l=new ArrayList();
		
		for(int i=0;i<a.length;i++) {
			boolean leader=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
				leader=false;
				}
			}
			if(leader) {
				l.add(a[i]);
			}
			
		}
		int ans[]=new int[l.size()];
		for(int i=0;i<l.size();i++) {
			ans[i]=l.get(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		 int a[] = {16, 17, 4, 8, 5, 2};

	        int ans[] = leading(a);

	        System.out.print("Leader Elements: ");

	        for (int x : ans) {
	            System.out.print(x + " ");
	        }

	}

}
