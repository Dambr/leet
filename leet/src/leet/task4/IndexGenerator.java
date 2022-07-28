package leet.task4;

public class IndexGenerator {

	private static int index;
	
	public IndexGenerator() {
		index = 0;
	}
	
	public int generate() {
		return index++;
	}
	
}
