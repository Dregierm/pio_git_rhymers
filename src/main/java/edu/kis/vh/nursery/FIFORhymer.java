package edu.kis.vh.nursery;


/**
 * Klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
 * Nadpisuje metode countOut
 * Posiada jedno pole typu DefaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/**
	 * Metoda countOut zwraca i usuwa pierwszy element z tablicy numbers (int)
	 * lub -1 w przypadku pustej tablicy
	 */
	@Override
	public int countOut() {
		// TODO: Poprawic formatowanie kodu w petlach while
		while (!callCheck())

		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())

		countIn(temp.countOut());
		
		return ret;
	}
}
