/**
 * 
 */
package lesson4.task1;

import lesson2.task1.Person;

/**
 * @author kschreier
 *
 */
public class TestParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName ("Mustermann");
		p1.setVorname ("Max");
		System.out.print ("Ausgabe Person vor Methodenaufruf: ");
		System.out.println (p1.getName() + " " + p1.getVorname());
		veränderePerson (p1);
		System.out.print ("Ausgabe Person nach Methodenaufruf: ");
		System.out.println (p1.getName() + " " + p1.getVorname());

	}
	
	public static void veränderePerson (Person ref)
	{
		ref.setName ("Weihnachtsmann");
		System.out.print ("Ausgabe der Person in der Methode: ");
		System.out.println (ref.getName() + " " + ref.getVorname());
	}
}
