/**
 * 
 */
package lesson5.task3;

/**
 * @author kschreier
 *
 */
public class TestBuch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Buch buch1 = new Buch("Harry Potter", "420-100", 3);
		Buch buch2 = new Buch("Harry Potter", "420-100", "Der Stein der Weisen", 3);
		buch1.ausgeben();
		buch2.ausgeben();
	}

}
