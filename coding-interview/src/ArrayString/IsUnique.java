/**
 * 
 */
package ArrayString;

import java.util.HashSet;

/**
 * @author danie
 *
 */
public class IsUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var isUnique = new IsUnique();
		//Test Examples
		isUnique.test("hola");
		isUnique.test("aabcdef");
		isUnique.test("a");
		isUnique.test("aba");
		isUnique.test("abb");

	}

	private void test(String str) {
		
		if(IsUnique(str)) {
			System.out.println(str+" is unique ");
		}else {
			System.out.println(str+" is NOT unique ");			
		}
	}
	
	private boolean IsUnique(String str) {
		HashSet<Character> set = new HashSet<Character>();
		boolean repeat = false;
		for (char c : str.toCharArray()) {
			repeat = set.contains(c); 
			set.add(c);
			if (repeat) break; 
		}
		return !repeat;
		
	}

}
