package leet.task11;

public class Solution {

	public int maxArea(int[] height) {

		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			int heightLeft = height[left];
			int heightRight = height[right];
			
			int currentArea = getArea(left, heightLeft, right, heightRight);
			if (currentArea > maxArea) {
				maxArea = currentArea;
			}

			if (height[right] > height[left])
				left++;
			else
				right--;
		}

		return maxArea;

	}
	
	private int getArea(int indexLeft, int heightLeft, int indexRight, int heightReight) {
		
		int x = Math.abs(indexRight - indexLeft);
		int y = Math.min(heightLeft, heightReight);
		
		return x * y;
	}

}
