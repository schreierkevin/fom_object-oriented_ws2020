/**
 * 
 */
package lesson5.task1;

/**
 * @author kschreier
 *
 */
public class Buch {
	
	private String titel;
	private String isbn;
	private int anzahlExemplare;
	
	/**
	 * constructor
	 * @param titel
	 * @param isbn
	 * @param anzahlExemplare
	 */
	public Buch(String titel, String isbn, int anzahlExemplare) {
		this.titel = titel;
		this.isbn = isbn;
		this.anzahlExemplare = anzahlExemplare;
	}
	
	/**
	 * print book
	 */
	public void ausgeben() {
		System.out.println("Titel: " + this.titel);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Exemplare: " + this.anzahlExemplare);
	}
	
}
