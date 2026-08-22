package selfpracticequestion;

import java.util.Arrays;

public class AllStringMethodsDemo {
    public static void main(String[] args) {

        String str = "  Java Programming  ";
        String str2 = "Java Programming";
        String str3 = "java programming";

        // 1. length()
        System.out.println("length(): " + str.length());

        // 2. charAt()
        System.out.println("charAt(2): " + str.charAt(2));

        // 3. substring()
        System.out.println("substring(5): " + str.substring(5));
        System.out.println("substring(2,6): " + str.substring(2, 6));

        // 4. concat()
        System.out.println("concat(): " + str.concat(" Language"));

        // 5. contains()
        System.out.println("contains(): " + str.contains("Java"));

        // 6. equals()
        System.out.println("equals(): " + str2.equals(str3));

        // 7. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + str2.equalsIgnoreCase(str3));

        // 8. compareTo()
        System.out.println("compareTo(): " + str2.compareTo(str3));

        // 9. compareToIgnoreCase()
        System.out.println("compareToIgnoreCase(): " + str2.compareToIgnoreCase(str3));

        // 10. startsWith()
        System.out.println("startsWith(): " + str2.startsWith("Java"));

        // 11. endsWith()
        System.out.println("endsWith(): " + str2.endsWith("ing"));

        // 12. indexOf()
        System.out.println("indexOf(): " + str2.indexOf("a"));

        // 13. lastIndexOf()
        System.out.println("lastIndexOf(): " + str2.lastIndexOf("a"));

        // 14. replace()
        System.out.println("replace(): " + str2.replace('a', 'o'));

        // 15. replaceAll()
        System.out.println("replaceAll(): " + str2.replaceAll("Java", "Python"));

        // 16. replaceFirst()
        System.out.println("replaceFirst(): " + str2.replaceFirst("a", "@"));

        // 17. toUpperCase()
        System.out.println("toUpperCase(): " + str2.toUpperCase());

        // 18. toLowerCase()
        System.out.println("toLowerCase(): " + str2.toLowerCase());

        // 19. trim()
        System.out.println("trim(): " + str.trim());

        // 20. isEmpty()
        System.out.println("isEmpty(): " + "".isEmpty());

        // 21. isBlank() (Java 11+)
        System.out.println("isBlank(): " + "   ".isBlank());

        // 22. split()
        String[] arr = str2.split(" ");
        System.out.println("split():");
        for (String s : arr) {
            System.out.println(s);
        }

        // 23. join()
        System.out.println("join(): " +
                String.join("-", "Java", "Python", "SQL"));

        // 24. matches()
        System.out.println("matches(): " +
                "12345".matches("[0-9]+"));

        // 25. toCharArray()
        char[] ch = str2.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 26. getBytes()
        byte[] b = str2.getBytes();
        System.out.print("getBytes(): ");
        for (byte x : b) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 27. valueOf()
        System.out.println("valueOf(): " + String.valueOf(100));

        // 28. repeat() (Java 11+)
        System.out.println("repeat(): " + "Java ".repeat(3));

        // 29. strip() (Java 11+)
        System.out.println("strip(): " + str.strip());

        // 30. stripLeading()
        System.out.println("stripLeading(): " + str.stripLeading());

        // 31. stripTrailing()
        System.out.println("stripTrailing(): " + str.stripTrailing());

        // 32. subSequence()
        System.out.println("subSequence(): " +
                str2.subSequence(0, 4));

        // 33. contentEquals()
        System.out.println("contentEquals(): " +
                str2.contentEquals("Java Programming"));

        // 34. intern()
        String s = new String("Java");
        System.out.println("intern(): " + s.intern());

        // 35. copyValueOf()
        char[] arrChar = {'J', 'A', 'V', 'A'};
        System.out.println("copyValueOf(): " +
                String.copyValueOf(arrChar));
        int[] arr1 = {50, 20, 40, 10, 30};

        // 1. sort()
        Arrays.sort(arr1);
        System.out.println("sort(): " + Arrays.toString(arr1));

        // 2. toString()
        System.out.println("toString(): " + Arrays.toString(arr1));

        // 3. binarySearch()
        System.out.println("binarySearch(): " +
                Arrays.binarySearch(arr1, 30));

        // 4. equals()
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("equals(): " +
                Arrays.equals(arr1, arr2));

        // 5. fill()
        Arrays.fill(arr2, 100);
        System.out.println("fill(): " +
                Arrays.toString(arr2));

        // 6. copyOf()
        int[] copy = Arrays.copyOf(arr1, arr1.length);
        System.out.println("copyOf(): " +
                Arrays.toString(copy));

        // 7. copyOfRange()
        int[] range = Arrays.copyOfRange(arr1, 1, 4);
        System.out.println("copyOfRange(): " +
                Arrays.toString(range));
    }
}