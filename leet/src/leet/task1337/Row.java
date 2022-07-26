package leet.task1337;

public class Row implements Comparable<Row> {

	private int[] row;
	private int index;

	public Row(int[] row, int index) {
		this.row = row;
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(Row o) {
		int result = 0;
		
		int soldiersCount = getSoldiersCount();
		int otherSoldiersCount = o.getSoldiersCount();
		
		if (soldiersCount > otherSoldiersCount) {
			result = 1;
		}
		if (soldiersCount < otherSoldiersCount) {
			result = -1;
		}
		if (soldiersCount == otherSoldiersCount) {
			result = compareByIndex(o);
		}
		return result;
	}

	private int getSoldiersCount() {
		int result = 0;
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1) {
				result++;
			}
		}
		return result;
	}
	
	private int compareByIndex(Row o) {
		int result = 0;
		
		int otherIndex = o.index;
		
		if (index > otherIndex) {
			result = 1;
		}
		if (index < otherIndex) {
			result = -1;
		}
		
		return result;
	}

}
