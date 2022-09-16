package leet.task49;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		
		Map<Key, List<String>> map = new HashMap<>();
		for (String string : strs) {
			char[] array = string.toCharArray();
			Arrays.sort(array);
			Key key = new Key(array);
			
			List<String> list = map.computeIfAbsent(key, k -> new LinkedList<>());
			list.add(string);
		}
		
		List<List<String>> result = map.values().stream().toList();

		return result;
	}
	
	class Key {
		private char[] array;
		
		public Key(char[] array) {
			this.array = array;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Arrays.hashCode(array);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Key other = (Key) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Arrays.equals(array, other.array);
		}

		private Solution getEnclosingInstance() {
			return Solution.this;
		}
		
	}

}
