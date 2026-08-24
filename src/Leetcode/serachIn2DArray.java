package Leetcode;

public class serachIn2DArray {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int r = matrix.length;
        int c = matrix[0].length;

        int low = 0;
        int high = r * c - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / c;
            int col = mid % c;

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        boolean result = searchMatrix(matrix, target);

        System.out.println(result);
    }
}