package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int CHECK = -1;
	private final int[] numbers = new int[getSIZE()];

	private int total = getCHECK();

	public static int getSIZE() {
		return SIZE;
	}

	public static int getCHECK() {
		return CHECK;
	}

	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	public int getTotal() {
		return total;
	}

	public boolean callCheck() {
			return getTotal() == getCHECK();
		}
		
			public boolean isFull() {
				return getTotal() == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return getCHECK();
					return getNumbers()[getTotal()];
				}
			
					public int countOut() {
						if (callCheck())
							return getCHECK();
						return getNumbers()[total--];
					}

	public int[] getNumbers() {
		return numbers;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
