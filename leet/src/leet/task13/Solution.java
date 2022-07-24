package leet.task13;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution {
	
	/*
	 * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
	 */
	
	private Map<Character, Integer> romanToIntMap;
	
	/*
	 * M             C
     * D             C
     * C             X
     * L             X
     * X             I
     * V             I
	 */
	
	private Map<Character, Character> romanToPrefs;
	
	public Solution() {
		romanToIntMap = new HashMap<>();
		romanToIntMap.put('I', 1);
		romanToIntMap.put('V', 5);
		romanToIntMap.put('X', 10);
		romanToIntMap.put('L', 50);
		romanToIntMap.put('C', 100);
		romanToIntMap.put('D', 500);
		romanToIntMap.put('M', 1000);
		
		romanToPrefs = new HashMap<>();
		romanToPrefs.put('M', 'C');
		romanToPrefs.put('D', 'C');
		romanToPrefs.put('C', 'X');
		romanToPrefs.put('L', 'X');
		romanToPrefs.put('X', 'I');
		romanToPrefs.put('V', 'I');
	}
	
    public int romanToInt(String roman) {
        int result = 0;
    	char[] characters = roman.toCharArray();
        
    	result += read('M', characters);
    	result += read('D', characters);
    	result += read('C', characters);
    	result += read('L', characters);
    	result += read('X', characters);
    	result += read('V', characters);
    	result += read('I', characters);
    	
        return result;
    }
    
    private int read(char symbol, char[] characters) {
    	int result = 0;
    	for (int i = 0; i < characters.length; i++) {
    		char cur = characters[i];
    		if (cur == symbol) {
    			Optional<Character> prefCharAsOptional = getPrefOf(cur);
        		if (i > 0 && prefCharAsOptional.isPresent()) {
        			char pref = characters[i - 1];
        			char prefChar = prefCharAsOptional.orElseThrow();
        			if (pref == prefChar) {
        				int intOf = getIntOf(symbol);
        				int intPref = getIntOf(pref);
        				int res = intOf - intPref;
        				result += res;
        				characters[i] = 0;
        				characters[i - 1] = 0;
        			} else {
            			result += getIntOf(symbol);
            			characters[i] = 0;
            		}
        		} else {
        			result += getIntOf(symbol);
        			characters[i] = 0;
        		}
    		}
    	}
    	return result;
    }
    
    private int getIntOf(char symbol) {
    	Integer result = romanToIntMap.get(symbol);
    	if (result == null) {
    		result = 0;
    	}
    	return result;
    }
    
    private Optional<Character> getPrefOf(char symbol) {
    	Character result = romanToPrefs.get(symbol);
    	return Optional.ofNullable(result);
    }
    
}
