package leet.task12;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	public String intToRoman(int num) {
		
		List<Integer> list = toList(num);
		StringBuilder stringBuilder = new StringBuilder();
		for (int number : list) {
			String roman = toRoman(number);
			stringBuilder.append(roman);
		}
		
		String result = stringBuilder.toString();
		return result;
	}
	
	private String toRoman(int number) {
		String roman = "";
		if (number < 5) {
			roman = toRoman(number, Roman.I, Roman.I, Roman.V);
		} else if (number >= 5 && number < 10) {
			roman = toRoman(number, Roman.I, Roman.V, Roman.X);
		} else if (number >= 10 && number < 50) {
			roman = toRoman(number, Roman.X, Roman.X, Roman.L);
		} else if (number >= 50 && number < 100) {
			roman = toRoman(number, Roman.X, Roman.L, Roman.C);
		} else if (number >= 100 && number < 500) {
			roman = toRoman(number, Roman.C, Roman.C, Roman.D);
		} else if (number >= 500 && number < 1000) {
			roman = toRoman(number, Roman.C, Roman.D, Roman.M);
		} else {
			roman = toRoman(number, Roman.M, Roman.M, Roman.INFINITY);
		}
		return roman;
	}
	
	private String toRoman(int number, Roman step, Roman minValue, Roman maxValue) {
		StringBuilder stringBuilder = new StringBuilder();
		int arabicStep = step.getArabic();
		int arabicMinValue = minValue.getArabic();
		int arabicMaxValue = maxValue.getArabic();
		if (number == arabicMaxValue - arabicStep) {
			stringBuilder.append(step);
			stringBuilder.append(maxValue);
		} else {
			stringBuilder.append(minValue);
			int count = number - arabicMinValue;
			for (int i = 0; i < count; i += arabicStep) {
				stringBuilder.append(step);
			}
		}
		String result = stringBuilder.toString();
		return result;
	}
	
	private List<Integer> toList(int num) {
		List<Integer> list = new LinkedList<>();
		String string = String.valueOf(num);
		int length = string.length();
		for (int i = 0; i < length; i++) {
			char symbol = string.charAt(i);
			String symbolAsString = String.valueOf(symbol);
			int number = Integer.parseInt(symbolAsString);
			int degree = length - i - 1;
			int magnitude = (int) Math.pow(10, degree);
			number *= magnitude;
			if (number != 0) {
				list.add(number);
			}
		}
		return list;
	}
	
}
