/**
 * 
 */
package lesson2.task1;

/**
 * @author kschreier
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setVorname("Max");
		p1.setName("Mustermann");
		
		Person p2;
		p2 = new Person();
		
		p2.setVorname("Ralf");
		p2.setName("Meister");
	
		System.out.println(p1.getName() + " " + p1.getVorname());
		System.out.println(p2.getName() + " " + p2.getVorname());
	}

}
