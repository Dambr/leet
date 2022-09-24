package leet.task73;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public void setZeroes(int[][] matrix) {
		int[] stbIndexes = getStbIndexes(matrix);
		int[] rowIndexes = getRowIndexes(matrix);

		for (int i : stbIndexes) {
			zeroStb(matrix, i);
		}

		for (int i : rowIndexes) {
			zeroRow(matrix, i);
		}
	}

	private void zeroStb(int[][] matrix, int stbIndex) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][stbIndex] = 0;
		}
	}

	private void zeroRow(int[][] matrix, int rowIndex) {
		for (int i = 0; i < matrix[rowIndex].length; i++) {
			matrix[rowIndex][i] = 0;
		}
	}

	private int[] getStbIndexes(int[][] matrix) {
		Set<Integer> indexes = new HashSet<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					indexes.add(j);
				}
			}
		}
		return toArray(indexes);
	}

	private int[] getRowIndexes(int[][] matrix) {
		Set<Integer> indexes = new HashSet<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					indexes.add(i);
				}
			}
		}
		return toArray(indexes);
	}

	private int[] toArray(Set<Integer> set) {
		List<Integer> list = set.stream().toList();
		int[] array = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		return array;
	}

}
