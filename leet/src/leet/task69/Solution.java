package leet.task69;

public class Solution {

	public int mySqrt(int x) {
		long result = 0;
		long i = 1;
		while (i * i <= x) {
			result = i;
			i++;
		}

		return (int) result;
	}

}
