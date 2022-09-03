package leet.task17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.function.Function;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<List<Character>> result = new LinkedList<>();
    	
        Map<Character, List<Character>> buttonsToLettersMap = new HashMap<>();
        buttonsToLettersMap.put('1', List.of());
        buttonsToLettersMap.put('2', List.of('a', 'b', 'c'));
        buttonsToLettersMap.put('3', List.of('d', 'e', 'f'));
        buttonsToLettersMap.put('4', List.of('g', 'h', 'i'));
        buttonsToLettersMap.put('5', List.of('j', 'k', 'l'));
        buttonsToLettersMap.put('6', List.of('m', 'n', 'o'));
        buttonsToLettersMap.put('7', List.of('p', 'q', 'r', 's'));
        buttonsToLettersMap.put('8', List.of('t', 'u', 'v'));
        buttonsToLettersMap.put('9', List.of('w', 'x', 'y', 'z'));
        
        int length = digits.length();
        for (int i = 0; i < length; i++) {
        	Character button = digits.charAt(i);
        	List<Character> letters = buttonsToLettersMap.get(button);
        	result = multiplyElements(result, letters);
        }
        
        Function<List<Character>, String> joinFunction = (characters) -> {
        	List<String> strings = characters.stream().map(String::valueOf).toList();
        	return String.join("", strings);
        };
        
    	return result.stream().map(joinFunction).toList();
    }
    
    private List<List<Character>> multiplyElements(List<List<Character>> list, List<Character> letters) {
    	List<List<Character>> result = new LinkedList<>();
    	
    	if (list.isEmpty()) {
    		for (Character letter : letters) {
    			List<Character> copy = new LinkedList<>();
    			copy.add(letter);
    			result.add(copy);
    		}
    	} else {
    		for (List<Character> characters : list) {
        		for (Character letter : letters) {
        			List<Character> copy = new LinkedList<>(characters);
        			copy.add(letter);
        			result.add(copy);
        		}
        	}
    	}
    	
    	return result;
    }
    
    
    
}
