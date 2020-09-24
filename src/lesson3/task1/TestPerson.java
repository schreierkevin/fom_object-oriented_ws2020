/**
 * 
 */
package lesson3.task1;

import lesson2.task1.Person;

/**
 * @author kschreier
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person refPerson = null;
		
		refPerson = new Person();
		refPerson.setVorname("Max");
		refPerson.setName("Mustermann");
		System.out.println(refPerson.getName() + " " + refPerson.getVorname());
		
		refPerson = new Person();
		refPerson.setVorname("Ralf");
		refPerson.setName("Meister");
		System.out.println(refPerson.getName() + " " + refPerson.getVorname());
	}

}
