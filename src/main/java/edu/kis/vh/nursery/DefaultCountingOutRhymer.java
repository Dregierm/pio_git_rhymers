package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INT1 = 12;
	public static final int INT2 = -1;
	private int[] numbers = new int[INT1];

	public int total = INT2;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == INT2;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return INT2;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return INT2;
						return numbers[total--];
					}

}
