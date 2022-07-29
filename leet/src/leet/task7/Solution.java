package leet.task7;

public class Solution {

	public int reverse(int x) {
		
		int result = 0;
		boolean isNegative = x < 0;

		x = Math.abs(x);

		String string = String.valueOf(x);
		String reverse = new StringBuilder(string).reverse().toString();

		try {
			result = Integer.parseInt(reverse);
		} catch (Exception e) {

		}
		
		if (isNegative) {
			result *= -1;
		}

		return result;
	}

}
