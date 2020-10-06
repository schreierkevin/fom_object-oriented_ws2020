/**
 * 
 */
package lesson4.task3;

/**
 * @author kschreier
 *
 */
public class AddInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0;
		
		/* Prüfe ob das Array größer ist als 2 Elemente. 
		 * Wenn kleiner als 2 Elemente dann wird in das IF reingesprungen 
		 * und eine Ausgabe erzeugt */
		if(args.length < 2) {
			System.out.println("You have to enter at least 2 arguments");
			return;
		}
		
		//loop over all strings in args
		for(String param: args) {
			try {
				result += Integer.parseInt(param);
			} catch(Exception ex) {
				System.out.println("Exception: " + ex.getMessage());
				return;
			}
		}
		
		System.out.println("Result: " + result);
	}
	
}
