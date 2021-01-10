/**
 *  @author RISHITA CHOUBEY
 * Exercise 2: Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .

Method Name 	getImage 
Method Description 	Generate the mirror image of a String and add it to the existing string. 
Argument 	String 
Return Type 	String 
Logic 	Accepts One String 
Find the mirror image of the String 
Add the two Strings together separated by a pipe(|) symbol. 
For Example 
Input : EARTH 
Output : EARTH|HTRAE 
Hint: Use StringBuffer API (Ex: For this problem reverse method in Stringbuffer can be used) 
Note: Learn the other APIs in StringBuffer 

 */

package com.cg.Lab3;

import java.io.*;

public class Exercise2 {
//
//		public static void main(String[] args) {
//		StringBuffer sb= new StringBuffer("EARTH");
//		StringBuffer res= getImage(sb);
//		System.out.println(sb+"|"+res);
//		

	

	static StringBuffer getImage(StringBuffer sb) {
		StringBuffer prev= new StringBuffer(sb);
		StringBuffer rev = sb.reverse();
		StringBuffer res= new StringBuffer();
		if(sb == null || sb.length() == 0){
	
			return null;
		}
		
		
		res.append(prev+ "|" + rev);
	     return res;
	

}
}
	



