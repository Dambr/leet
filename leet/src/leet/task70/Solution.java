package leet.task70;

public class Solution {

	public int climbStairs(int n) {
		int f = 0;
		int s = 1;
		int count = 0;
		while (count < n) {
			int tmp = f;
			f = s;
			s = f + tmp;
			count++;
		}
		return s;
	}

}
