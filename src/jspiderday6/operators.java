package jspiderday6;

public class operators {

    public static void main(String[] args) {

        // Arithmetic Operators: +, -, *, /, %
        int a = 20;
        int b = 10;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment Operators: =, +=, -=, *=, /=, %=
        int x = 10;

        x += 5;
        System.out.println("\nAfter += : " + x);

        x -= 3;
        System.out.println("After -= : " + x);

        x *= 2;
        System.out.println("After *= : " + x);

        x /= 4;
        System.out.println("After /= : " + x);

        x %= 3;
        System.out.println("After %= : " + x);

        // Relational Operators: <, >, <=, >=, ==, !=
        int p = 15;
        int q = 20;

        System.out.println("\nRelational Operators");
        System.out.println("p < q : " + (p < q));
        System.out.println("p > q : " + (p > q));
        System.out.println("p <= q : " + (p <= q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));

        // Logical Operators: &&, ||, !
        boolean m = true;
        boolean n = false;

        System.out.println("\nLogical Operators");
        System.out.println("m && n : " + (m && n));
        System.out.println("m || n : " + (m || n));
        System.out.println("!m : " + (!m));

        // Unary Operators: ++, --
        int num = 5;

        System.out.println("\nUnary Operators");
        System.out.println("Initial Value: " + num);

        System.out.println("Post Increment: " + (num++));
        System.out.println("After Post Increment: " + num);

        System.out.println("Pre Increment: " + (++num));

        System.out.println("Post Decrement: " + (num--));
        System.out.println("After Post Decrement: " + num);

        System.out.println("Pre Decrement: " + (--num));

        // Ternary Operator
        int age = 18;

        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible";

        System.out.println("\nTernary Operator");
        System.out.println(result);

        // Bitwise Operators: &, |, ^, ~
        int r = 5;
        int s = 3;

        System.out.println("\nBitwise Operators");
        System.out.println("r & s : " + (r & s));
        System.out.println("r | s : " + (r | s));
        System.out.println("r ^ s : " + (r ^ s));
        System.out.println("~r : " + (~r));

        // Conditional Operators
        int marks = 75;

        System.out.println("\nConditional Statements");

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
    }
}
