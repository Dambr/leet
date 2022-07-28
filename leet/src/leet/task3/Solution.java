package leet.task3;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		
		for (int i = 0; i < s.length(); i++) {
			Set<Character> set = new HashSet<>();
			for (int j = i; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (!set.add(ch)) {
					break;
				}
			}
			int size = set.size();
			if (size > maxLength) {
				maxLength = size;
			}
		}
		
		return maxLength;
	}

}
