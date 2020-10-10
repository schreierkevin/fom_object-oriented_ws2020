/**
 * 
 */
package lesson5.task2;

/**
 * @author kschreier
 *
 */
public class Buch {
	
	private String titel;
	private String isbn;
	private String unterTitel;
	private int anzahlExemplare;
	
	/**
	 * constructor
	 * @param titel
	 * @param isbn
	 * @param anzahlExemplare
	 */
	public Buch(String titel, String isbn, int anzahlExemplare) {
		this(titel, isbn, "", anzahlExemplare);
	}
	
	/**
	 * constructor 2
	 * @param titel
	 * @param isbn
	 * @param unterTitel
	 * @param anzahlExemplare
	 */
	public Buch(String titel, String isbn, String unterTitel, int anzahlExemplare) {
		this.titel = titel;
		this.isbn = isbn;
		this.anzahlExemplare = anzahlExemplare;
		this.unterTitel = unterTitel;
	}
	
	/**
	 * print book
	 */
	public void ausgeben() {
		System.out.println("Titel: " + this.titel);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Exemplare: " + this.anzahlExemplare);
		System.out.println("Untertitel: " + this.unterTitel);
	}
	
}
