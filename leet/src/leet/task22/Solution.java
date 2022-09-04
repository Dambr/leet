package leet.task22;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

	private final char open;
	private final char close;
	
	public Solution() {
		this.open = '(';
		this.close = ')';
	}
	
	public List<String> generateParenthesis(int n) {
		int count = n * 2;
		List<int[]> combinations = generate(count, n);
		List<char[]> lines = new LinkedList<>();
		for (int[] openPositions : combinations) {
			char[] line = new char[count];
			for (int i = 0; i < count; i++) {
				line[i] = close;
			}
			for (int i : openPositions) {
				line[i] = open;
			}
			if (valid(line)) {
				lines.add(line);
			}
		}
		
		return lines.stream().map(String::new).toList();
	}
	
	private boolean valid(char[] line) {
		boolean result = true;
		
		Stack<Character> stack = new Stack<>();
		
		for (char current : line) {
			if (current == open) {
				stack.add(open);
			} else if (current == close) {
				try {
					stack.pop();
				} catch (EmptyStackException e) {
					result = false;
					break;
				}
			}
		}
		
		if (result) {
			result = stack.isEmpty();
		}
		
		return result;
	}
	
	private List<int[]> generate(int n, int r) {
	    List<int[]> combinations = new LinkedList<>();
	    helper(combinations, new int[r], 0, n-1, 0);
	    return combinations;
	}
	
	private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
	    if (index == data.length) {
	        int[] combination = data.clone();
	        combinations.add(combination);
	    } else if (start <= end) {
	        data[index] = start;
	        helper(combinations, data, start + 1, end, index + 1);
	        helper(combinations, data, start + 1, end, index);
	    }
	}

}
