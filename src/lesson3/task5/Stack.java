/**
 * 
 */
package lesson3.task5;

/**
 * @author kschreier
 *
 */
public class Stack {
	
	private int[] stack;
	private int count;

	public Stack(int i) {
		stack = new int[i];
		count = 0;
	}

	public void push(int i) {
		
		if(count >= stack.length) {
			return;
		}
		
		stack[count++] = i;
	}

	public void stackPrint() {
		for(int i=0; i < count; i++) {
			System.out.println(i + ": " + stack[i]);
		}
	}

	public boolean isEmpty() {
		if(count <= 0) {
			return true;
		}
		
		return false;
	}

	public int pop() {
		if(count == 0) {
			return 0;
		}
		
		return stack[--count];
	}
}
