package DSA;

import java.util.*;

public class collectionarrl {

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(5);
        arraylist.add(80);
        arraylist.set(1,10);

        // Print full list
        System.out.println(arraylist);

        // Access element
        System.out.println("Element at index 1: " + arraylist.get(1));

        // Loop through list
        for (int num : arraylist) {
            System.out.println(num);
        }
    }
}