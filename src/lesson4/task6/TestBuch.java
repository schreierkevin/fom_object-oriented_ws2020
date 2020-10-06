/**
 * 
 */
package lesson4.task6;

/**
 * @author kschreier
 *
 */
public class TestBuch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Buch buch1 = new Buch();
		buch1.setTitel("Harry Potter");
		buch1.setIsbn("420-100");
		buch1.setAnzahlExemplare(3);
		
		System.out.println("Titel: " + buch1.getTitel());
		System.out.println("ISBN: " + buch1.getIsbn());
		System.out.println("Exemplare: " + buch1.getAnzahlExemplare());
		
	}

}
