package leet.task50;

public class Solution {

	public double myPow(double x, int n) {
		boolean isNegative = n < 0;
		n = Math.abs(n);
		
		if (x == -1) {
			if (n % 2 == 0) {
				return 1;
			} else {
				return -1;
			}
		}
		
		if (n < 0) {
			if (x == 1) {
				return 1;
			}
			return 0;
		}
		
		
		double result = 1;
		if (x != 1) {
			for (int i = 0; i < n; i++) {
				result *= x;
			}
			
			if (isNegative) {
				result = 1/result;
			}
		}
		
		return result;
	}

}
