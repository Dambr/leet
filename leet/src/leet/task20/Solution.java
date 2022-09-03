package leet.task20;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

	public boolean isValid(String s) {
		
		boolean valid = true;
		
		Map<Character, Character> closeToOpenMap = new HashMap<>();
		closeToOpenMap.put(')', '(');
		closeToOpenMap.put('}', '{');
		closeToOpenMap.put(']', '[');
		
		Collection<Character> close = closeToOpenMap.keySet();
		Collection<Character> open = closeToOpenMap.values();
		
		Stack<Character> openStack = new Stack<>();
		
		int length = s.length();
		for (int i = 0; i < length; i++) {
			Character current = s.charAt(i);
			if (open.contains(current)) {
				openStack.add(current);
			}
			if (close.contains(current)) {
				try {
					Character lastOpen = openStack.pop();
					Character expectedLastOpen = closeToOpenMap.get(current);
					if (!lastOpen.equals(expectedLastOpen)) {
						valid = false;
						break;
					}
				} catch (EmptyStackException e) {
					valid = false;
					break;
				}
				
			}
		}
		
		if (valid) {
			valid = openStack.isEmpty();
		}
		
		return valid;
	}

}
