package leet.task1672;

public class Solution {

	public int maximumWealth(int[][] accounts) {
		
		int maxSum = Integer.MIN_VALUE;
		
		for (int[] row : accounts) {
			int sum = getSum(row);
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		
		return maxSum;
	}
	
	private int getSum(int[] array) {
		
		int result = 0;
		
		for (int number : array) {
			result += number;
		}
		
		return result;
	}

}
