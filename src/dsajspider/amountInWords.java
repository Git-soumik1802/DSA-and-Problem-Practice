package dsajspider;

import java.util.Scanner;

public class amountInWords {

    static String[] one = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        long num = sc.nextLong();

        if (num == 0) {
            System.out.println("Zero");
        } else {
            numberToWords(num);
        }
    }

    public static void numberToWords(long num) {

        if (num >= 10000000) {
            numberToWords(num / 10000000);
            System.out.print("Crore ");
            num %= 10000000;
        }

        if (num >= 100000) {
            numberToWords(num / 100000);
            System.out.print("Lakh ");
            num %= 100000;
        }

        if (num >= 1000) {
            numberToWords(num / 1000);
            System.out.print("Thousand ");
            num %= 1000;
        }

        if (num >= 100) {
            numberToWords(num / 100);
            System.out.print("Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            System.out.print(tens[(int) num / 10] + " ");
            num %= 10;
        }

        if (num > 0) {
            System.out.print(one[(int) num] + " ");
        }
    }
}