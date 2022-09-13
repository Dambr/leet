package leet.task36;

import java.util.HashMap;
import java.util.Map;

class Solution {
	
	public boolean isValidSudoku(char[][] board) {
		int length = board.length;
		boolean result = true;
		
		for (int i = 0; i < length; i++) {
			char[] str = getStr(board, i);
			char[] stb = getStb(board, i);
			
			boolean strValid = isValidLine(str);
			boolean stbValid = isValidLine(stb);
			result = strValid && stbValid;
			if (!result) {
				break;
			}
		}
		
		if (result) {
			label:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					int left = j * 3;
					int top = i * 3;
					char[][] miniSquare = getMiniSquare(board, left, top);
					result = isValidMiniSquare(miniSquare);
					if (!result) {
						break label;
					}
				}
			}
		}
		
		return result;
	}
	
	private char[] getStr(char[][] board, int index) {
		int length = board.length;
		char[] result = new char[length];
		
		for (int i = 0; i < length; i++) {
			result[i] = board[index][i];
		}
		
		return result;
	}
	
	private char[] getStb(char[][] board, int index) {
		int length = board.length;
		char[] result = new char[length];
		
		for (int i = 0; i < length; i++) {
			result[i] = board[i][index];
		}
		
		return result;
	}
	
	private char[][] getMiniSquare(char[][] board, int left, int top) {
		int length = board.length / 3;
		char[][] square = new char[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				char symbol = board[i + top][j + left];
				square[i][j] = symbol;
			}
		}
		return square;
	}
	
	private boolean isValidLine(char[] line) {
		Map<Character, Integer> map = new HashMap<>();
		for (char symbol : line) {
			map.compute(symbol, (k, v) -> (v == null) ? 1 : v+1);
		}
		map.remove('.');
		boolean result = true;
		for (char symbol : map.keySet()) {
			int count = map.get(symbol);
			if (count > 1) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	private boolean isValidMiniSquare(char[][] square) {
		int length = square.length;
		boolean result = true;
		
		for (int i = 0; i < length; i++) {
			char[] str = getStr(square, i);
			char[] stb = getStb(square, i);
			
			boolean validStr = isValidLine(str);
			boolean validStb = isValidLine(stb);
			
			result = validStb && validStr;
			if (!result) {
				break;
			}
		}
		
		if (result) {
			char[] line = new char[length * length];
			int index = 0;
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					line[index] = square[i][j];
					index++;
				}
			}
			result = isValidLine(line);
		}
		
		return result;
	}
	
}
