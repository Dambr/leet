package leet.task5;

class Solution {
	public String longestPalindrome(String s) {
		String ans = "";
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			int j = i;
			int k = i;

			while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
				j--;
				k++;
			}
			temp = s.substring(j + 1, k);
			if (ans.length() < temp.length()) {
				ans = new String(temp);
			}
			j = i;
			k = i + 1;

			while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
				j--;
				k++;
			}
			temp = s.substring(j + 1, k);
			if (ans.length() < temp.length()) {
				ans = new String(temp);
			}

		}
		return ans;

	}
}