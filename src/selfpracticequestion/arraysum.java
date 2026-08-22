package selfpracticequestion;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++) {
            arr2[i]=sc.nextInt();
        }

        int k=0;

        if(n>m) {
            k=n;
        }
        else {
            k=m;
        }

        int[] res = new int[k];

        for(int i=0;i<k;i++) {
            if(i<n && i<m) {
                res[i]=arr1[i]+arr2[i];
            }
            else if(i<n) {
                res[i]=arr1[i];
            }
            else {
                res[i]=arr2[i];
            }
        }

        for(int c:res) {
            System.out.println(c);
        }
    }
}