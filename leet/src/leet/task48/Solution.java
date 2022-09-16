package leet.task48;

public class Solution {

	public void rotate(int[][] matrix) {

		int length = matrix.length;
		int[][] matrixClone = getClone(matrix);

		for (int i = 0; i < length; i++) {
			int[] stbValues = getStbValues(matrixClone, i);
			for (int j = 0; j < length; j++) {
				matrix[i][j] = stbValues[j];
			}
		}
	}

	private int[] getStbValues(int[][] matrix, int number) {
		int length = matrix.length;
		int[] values = new int[length];
		for (int i = 0; i < length; i++) {
			values[length - 1 - i] = matrix[i][number];
		}
		return values;
	}

	private int[][] getClone(int[][] matrix) {
		int length = matrix.length;
		int[][] clone = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				clone[i][j] = matrix[i][j];
			}
		}
		return clone;
	}

}
