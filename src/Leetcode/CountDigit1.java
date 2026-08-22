package Leetcode;

import java.util.Scanner;

public class CountDigit1 {

    public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Total digits = " + countDigits(num));
    }
}
