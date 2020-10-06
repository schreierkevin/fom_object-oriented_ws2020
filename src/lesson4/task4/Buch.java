/**
 * 
 */
package lesson4.task4;

/**
 * @author kschreier
 *
 */
public class Buch {

	private String titel;
	private String isbn;
	private int anzahlExemplare;
	
	/**
	 * @return the titel
	 */
	public String getTitel() {
		return titel;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @return the anzahlExemplare
	 */
	public int getAnzahlExemplare() {
		return anzahlExemplare;
	}
	/**
	 * @param titel the titel to set
	 */
	public void setTitel(String titel) {
		this.titel = titel;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @param anzahlExemplare the anzahlExemplare to set
	 */
	public void setAnzahlExemplare(int anzahlExemplare) {
		this.anzahlExemplare = anzahlExemplare;
	}
	
}
