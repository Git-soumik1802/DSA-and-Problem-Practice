package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class orangesRotting {
	public static int orangesRotting(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		Queue<int[]> queue = new LinkedList<>();
		int fresh = 0;
		int time = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 2) {
					queue.offer(new int[] { i, j });

				} else if (grid[i][j] == 1) {
					fresh++;
				}
			}
		}
		if (fresh == 0) {
			return 0;
		}
		while (!queue.isEmpty() && fresh > 0) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] curr = queue.poll();
				int row = curr[0];
				int col = curr[1];

				if (row - 1 >= 0 && grid[row - 1][col] == 1) {
					grid[row - 1][col] = 2;
					fresh--;
					queue.offer(new int[] { row - 1, col });
				}
				if (row + 1 < rows && grid[row + 1][col] == 1) {
					grid[row + 1][col] = 2;
					fresh--;
					queue.offer(new int[] { row + 1, col });
				}
				if (col - 1 >= 0 && grid[row][col - 1] == 1) {
					grid[row][col - 1] = 2;
					fresh--;
					queue.offer(new int[] { row, col - 1 });
				}
				if (col + 1 < cols && grid[row][col + 1] == 1) {
					grid[row][col + 1] = 2;
					fresh--;
					queue.offer(new int[] { row, col + 1 });
				}

			}
			time++;
		}

		if (fresh == 0) {
			return time;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };

		System.out.println(orangesRotting(grid));

	}

}
