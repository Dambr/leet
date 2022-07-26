package leet.task412;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	public List<String> fizzBuzz(int n) {
		List<String> result = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			String element = getFizzBuzz(i);
			result.add(element);
		}
		
		return result;
	}
	
	private String getFizzBuzz(int n) {
		return (n % 3 == 0 && n % 5 == 0) ? "FizzBuzz" : getFizz(n);
	}
	
	private String getFizz(int n) {
		return (n % 3 == 0) ? "Fizz" : getBuzz(n);
	}
	
	private String getBuzz(int n) {
		return (n % 5 == 0) ? "Buzz" : getString(n);
	}
	
	private String getString(int n) {
		return String.valueOf(n);
	}
	
}
