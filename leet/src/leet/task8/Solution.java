package leet.task8;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public int myAtoi(String s) {
		s = s.trim();
		Pattern pattern = Pattern.compile("^(\\+|-)?([0-9]+)");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
			String sign = matcher.group(1);
			
			s = matcher.group(2);
			if (sign != null && sign.equals("-")) {
				s = "-" + s;
			}
		}
		
		int result = 0;
		BigInteger max = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		BigInteger min = new BigInteger(String.valueOf(Integer.MIN_VALUE));
		try {
			BigInteger bigInteger = new BigInteger(s);
			
			if (bigInteger.compareTo(max) == 1) {
				result = max.intValue();
			} else if (bigInteger.compareTo(min) == -1) {
				result = min.intValue();
			} else {
				result = bigInteger.intValue();
			}
		} catch (Exception e) {
			
		}
		
		return result;
	}
}
