package leet.task54;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Solution {

	private int counter;
	private int start;

	public Solution() {
		this.counter = 1;
		this.start = 1;
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new LinkedList<>();

		int verticalDirectionLength = matrix.length;
		int horizontalDirectionLength = matrix[0].length;

		Direction vertical = new Direction(verticalDirectionLength);
		Direction horizontal = new Direction(horizontalDirectionLength);

		BooleanSupplier supplier = () -> counter >= start + verticalDirectionLength * horizontalDirectionLength;

		while (true) {
			for (int i = horizontal.min; i <= horizontal.max; i++) {
				result.add(matrix[vertical.min][i]);
				counter++;
			}
			vertical.min++;
			if (supplier.getAsBoolean()) {
				break;
			}
			for (int i = vertical.min; i <= vertical.max; i++) {
				result.add(matrix[i][horizontal.max]);
				counter++;
			}
			horizontal.max--;
			if (supplier.getAsBoolean()) {
				break;
			}
			for (int i = horizontal.max; i >= horizontal.min; i--) {
				result.add(matrix[vertical.max][i]);
				counter++;
			}
			vertical.max--;
			if (supplier.getAsBoolean()) {
				break;
			}
			for (int i = vertical.max; i >= vertical.min; i--) {
				result.add(matrix[i][horizontal.min]);
				counter++;
			}
			horizontal.min++;
			if (supplier.getAsBoolean()) {
				break;
			}
		}

		return result;
	}

	class Direction {
		int min;
		int max;

		public Direction(int length) {
			this.min = 0;
			this.max = length - 1;
		}
	}

}
