package DynamicProgramming1;

public class HouseRobberII {

    static int[] dp;

    public static int rob(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int case1 = robRange(nums, 1, n - 1);
        int case2 = robRange(nums, 0, n - 2);

        return Math.max(case1, case2);
    }

    public static int robRange(int[] nums, int start, int end) {

        int size = end - start + 1;

        dp = new int[size];

        dp[0] = nums[start];

        if (size > 1)
            dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < size; i++) {
            dp[i] = Math.max(
                dp[i - 2] + nums[start + i],
                dp[i - 1]
            );
        }

        return dp[size - 1];
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));
    }
}