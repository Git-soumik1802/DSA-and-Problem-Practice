package Jspiderjavaday3;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Swap Two Numbers
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: " + a + "," + b);

        // Area of Circle
        int r = sc.nextInt();

        double pi = Math.PI;
        double area = pi * r * r;

        System.out.println("Area = " + area);

        // Calculator
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        float sum = x + y;
        float sub = x - y;
        float mul = x * y;
        float div = x / y;
        float mod = x % y;

        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub);
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);
        System.out.println("Mod = " + mod);

        sc.close();
    }
}