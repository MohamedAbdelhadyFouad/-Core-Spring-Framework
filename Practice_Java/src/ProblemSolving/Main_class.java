package ProblemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Main_class {

	public static void main(String[] args) {

		// System.out.println(reverse("civic"));

		// new Practice_Problems(5); /*Pattern calss*/

		// System.out.println((int)(Math.random()*6+1));
		
		///////////////////////////////////////////////////////////////////////////////////
		/*Logger logger = Logger.getLogger(Main_class.class.getName());
		String x = "mohameeeeed";
		char charArray[] = x.toCharArray();
		//String characters="";
	     //ArrayList<Character> characters = new ArrayList<>();
		int index;
		for (int i = 0; i < charArray.length; i++) {
			index=0;
			for (int j = i+1; j < charArray.length ; j++) {
						if(charArray[i]==charArray[j]&& charArray[i] != ' ') {
							index++;
							charArray[j]='0';
							
						}
					}
			if(index > 0 && charArray[i]!='0' ) {
				System.out.println(charArray[i]);
				
			}
			}*/
		
		
		/**
		 *  here to lear  hashmmap
		 */
		Map<String,Integer> map = new HashMap<>();
		map.put("bb", 1);
		map.put("bb", 2);
		
System.out.println(map.get("bb"));
		
					
		}	
		
		

	
	public static boolean reverse(String x) {
		/**
		 * level
		 */

		char toCharacter[] = x.toCharArray();
		for (int i = 0; i < x.length() / 2; i++) {
			if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
				return false;

			}
		}

		return true;

	}

}
