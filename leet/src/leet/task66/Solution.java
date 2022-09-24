package leet.task66;

import java.math.BigInteger;

public class Solution {

	public int[] plusOne(int[] digits) {

		StringBuilder stringBuilder = new StringBuilder();
		for (int digit : digits) {
			stringBuilder.append(digit);
		}
		BigInteger number = new BigInteger(stringBuilder.toString());
		number = number.add(BigInteger.ONE);

		String string = number.toString();
		int[] result = new int[string.length()];
		for (int i = 0; i < string.length(); i++) {
			result[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
		}

		return result;
	}

}
