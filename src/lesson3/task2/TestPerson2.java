/**
 * 
 */
package lesson3.task2;

import lesson2.task1.Person;

/**
 * @author kschreier
 *
 */
public class TestPerson2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] personen = new Person[3];
		
		personen[0] = new Person();
		personen[0].setName("Schreier");
		personen[0].setVorname("Kevin");
		personen[1] = new Person();
		personen[1].setName("Mustermann");
		personen[1].setVorname("Max");
		personen[2] = new Person();
		personen[2].setName("Meister");
		personen[2].setVorname("Ralf");
		
		for(Person person: personen) {
			System.out.println(person.getName() + " " + person.getVorname());
		}
	}
}

