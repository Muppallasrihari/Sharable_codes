/** 
 * @author RISHITA CHOUBEY
 *Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels

Method Name 	alterString 
Method Description 	Replace consonants 
Argument 	String 
Return Type 	String 
Logic 	Return the String replacing all the consonants with the next character. 
For Example :JAVA should be changed as KAWA 
 */
package com.cg.Lab3;

public class Exercise3 {

	public static void main(String[] args) {
		String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
		String res = alterString(consonants);
		char[] result = res.toCharArray();
		System.out.println(res);

	}

	private static String alterString(String cs) {

		String inputString = "JAVA";

		String retStr = "";

		for (int i = 0; i < inputString.length(); i++) {
			char inputChar = inputString.charAt(i);

			int indexOfCons = cs.indexOf(inputChar);

			if (indexOfCons != -1) {
				indexOfCons++;

				// if the letter is Z, then go around to B
				if (indexOfCons == cs.length()) {
					indexOfCons = 0;
				}
				retStr += cs.charAt(indexOfCons);
			} else {
				retStr += inputChar;
			}
		}

		return retStr;
	}
}
