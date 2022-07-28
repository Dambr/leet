package leet.task4;

public class Element implements Comparable<Element> {

	private int val;
	private int index;
	
	public Element(int val, int index) {
		this.val = val;
		this.index = index;
	}
	
	public int getVal() {
		return val;
	}

	@Override
	public int compareTo(Element o) {
		int result = 0;
		if (val > o.val) {
			result = 1;
		}
		if (val < o.val) {
			result = -1;
		}
		if (result == 0) {
			result = compareByIndex(o);
		}
		return result;
	}
	
	private int compareByIndex(Element o) {
		int result = 0;
		if (index > o.index) {
			result = 1;
		}
		if (index < o.index) {
			result = -1;
		}
		return result;
	}
	
}
