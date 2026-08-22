package arrayProblems;

public class FindMinimum {

    public static int Minimum(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 2};

        int ans = Minimum(arr);

        System.out.println("Minimum element is: " + ans);
    }
}
