package RECURSION;

public class TowerOfHanoi {

    public static void TOW(int n, int src, int helper, int dest) {

        // Base case
        if (n == 1) {
            System.out.println(n + "," + src + "," + dest);
            return;
        }

        // Move n-1 disks from source to helper
        TOW(n - 1, src, dest, helper);

        // Move nth disk from source to destination
        System.out.println(n + "," + src + "," + dest);

        // Move n-1 disks from helper to destination
        TOW(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        int n = 3;

        TOW(n, 1, 2, 3);
    }
}