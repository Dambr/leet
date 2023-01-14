package leet.task12;

public enum Roman {

	I (1),
	V (5),
	X (10),
	L (50),
	C (100),
	D (500),
	M (1000),
	INFINITY (Integer.MAX_VALUE);
	
	private final int arabic;
	
	private Roman(int arabic) {
		this.arabic = arabic;
	}
	
	public int getArabic() {
		return arabic;
	}
	
}
