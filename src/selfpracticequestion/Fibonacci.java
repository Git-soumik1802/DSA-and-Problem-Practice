package selfpracticequestion;
import java.util.Scanner;
//class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int i = 1;
//        while(i <= n) {
//            System.out.print(a + " ");
//            int c = a + b;
//            a = b;
//            b = c;
//            i++;
//        }
//        sc.close();
//    }
//}
class Fibonacci {

    static int fib(int n) {

        if(n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 7;

        for(int i = 0; i < n; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}