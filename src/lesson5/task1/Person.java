/**
 * 
 */
package lesson5.task1;

/**
 * @author kschreier
 *
 */
public class Person {
	
	private String vorname;
	private String name;
	
	/**
	 * constructor
	 * @param vorname
	 * @param name
	 */
	public Person(String vorname, String name) {
		this.vorname = vorname;
		this.name = name;
	}
	
	/**
	 * print book
	 */
	public void ausgeben() {
		System.out.println("Vorname: " + this.vorname);
		System.out.println("Name: " + this.name);
	}
}
