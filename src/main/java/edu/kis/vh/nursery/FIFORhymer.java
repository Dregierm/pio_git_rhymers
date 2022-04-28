package edu.kis.vh.nursery;

/**
 * Klasa FIFORhymer dziedziczy klase DefaultCountingOutRhymer
 * Klasa posiada metode countOut zwracajaca int
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();


	/**
	 * Metoda countOut zwraca ostatni element w tablicy numbers
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
