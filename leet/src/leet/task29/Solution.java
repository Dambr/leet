package leet.task29;

class Solution {

	public int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;

		int sign = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;

		divisor = -Math.abs(divisor);
		dividend = -Math.abs(dividend);

		int sol = divRec(dividend, divisor);

		return sign < 0 ? -sol : sol;
	}

	private int divRec(int dividend, int divisor) {

		int result;

		if (divisor < dividend) {
			result = 0;
		} else if (divisor == dividend) {
			result = 1;
		} else {
			int sol = 1;
			int current = divisor;

			while (dividend - current < current) {
				sol += sol;
				current += current;
			}
			result = sol + divRec(dividend - current, divisor);
		}

		return result;
	}

}
