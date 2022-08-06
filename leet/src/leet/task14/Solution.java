package leet.task14;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		String fStr = strs[0];
		String maxPrefix = "";
		String prefix = "";

		for (int i = 0; i < fStr.length(); i++) {
			char symbol = fStr.charAt(i);
			prefix += String.valueOf(symbol);
			boolean allStrsHavePrefix = isAllStrsHavePrefix(strs, prefix);
			if (!allStrsHavePrefix) {
				break;
			}
			maxPrefix = prefix;
		}

		return maxPrefix;
	}

	private boolean isAllStrsHavePrefix(String[] strs, String prefix) {
		boolean allHave = true;
		for (String str : strs) {
			if (!str.startsWith(prefix)) {
				allHave = false;
				break;
			}
		}
		return allHave;
	}

}
