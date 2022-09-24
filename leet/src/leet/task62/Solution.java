package leet.task62;

public class Solution {

	public int uniquePaths(int m, int n) {
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (i == 0 || j == 0) ? 1 : arr[i - 1][j] + arr[i][j - 1];
			}
		}
		return arr[m - 1][n - 1];
	}

}
