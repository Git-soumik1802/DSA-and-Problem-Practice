package mock4;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        int[] arr = new int[hs.size()];

        int i = 0;

        for (int x : hs) {
            arr[i++] = x;
        }

        // HashSet is unordered, so sort arr
        Arrays.sort(arr);

        int count = 1;
        int max = 1;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] == arr[j - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {

        LongestConsecutiveSequence obj =
                new LongestConsecutiveSequence();

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(obj.longestConsecutive(nums));
    }
}