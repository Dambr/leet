package leet.task383;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

	public boolean canConstruct(String ransomNote, String magazine) {
		boolean result = true;

		char[] ransomNoteArray = ransomNote.toCharArray();
		char[] magazineArray = magazine.toCharArray();

		Map<Character, Integer> ransomNoteMap = getCountMap(ransomNoteArray);
		Map<Character, Integer> magazineMap = getCountMap(magazineArray);

		Set<Character> ransomNoteSet = new HashSet<>(ransomNoteMap.keySet());

		for (char symbol : ransomNoteSet) {
			Integer ransomNoteCount = ransomNoteMap.get(symbol);
			Integer magazineCount = magazineMap.get(symbol);
			if (magazineCount == null || ransomNoteCount.intValue() > magazineCount.intValue()) {
				result = false;
				break;
			}
		}

		return result;
	}

	private Map<Character, Integer> getCountMap(char[] symbols) {
		Map<Character, Integer> map = new HashMap<>();
		for (char symbol : symbols) {
			if (map.get(symbol) == null) {
				int count = getCount(symbol, symbols);
				map.put(symbol, count);
			}
		}
		return map;
	}

	private int getCount(char symbol, char[] symbols) {
		int count = 0;
		for (char cur : symbols) {
			if (symbol == cur) {
				count++;
			}
		}
		return count;
	}

}
