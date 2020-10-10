/**
 * 
 */
package practise.task1;

/**
 * @author kschreier
 *
 */
public class Faculty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = calcFaculty(2);
		System.out.println(result);

	}
	
	/**
	 * calculate Faculty
	 * @param n - number of falculty
	 * @return
	 */
	private static int calcFaculty(int n) {
		int result = 1;
		
		for(int i=1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}

}
