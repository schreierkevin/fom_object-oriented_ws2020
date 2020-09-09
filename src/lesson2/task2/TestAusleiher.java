/**
 * 
 */
package lesson2.task2;

/**
 * @author kschreier
 *
 */
public class TestAusleiher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ausleiher p1 = new Ausleiher();
		
		p1.setVorname("Max");
		p1.setName("Mustermann");
		p1.setAusleiherNummer(100);
		
		
		System.out.println(p1.getName() + " " + p1.getVorname());
		System.out.println("mit Nummer: " + p1.getAusleiherNummer());
	}

}
