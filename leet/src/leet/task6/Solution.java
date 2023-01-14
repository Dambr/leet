package leet.task6;

public class Solution {

	public boolean isPalindrome(int x) {
		String xString = String.valueOf(x);
		StringBuilder stringBuilder = new StringBuilder(xString);
		stringBuilder.reverse();
		String reverce = stringBuilder.toString();
		boolean result = xString.equals(reverce);
		return result;
	}
	
}
