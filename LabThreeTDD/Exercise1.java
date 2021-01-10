/** 
* Name : Pranjali Chaudhari
* Desc : Java program that reads a line of integers 
* and then displays each integer and the sum of all integers.
*  (Use String Tokenizer class)
*/
package com.cg.LabThree;

/**
 * 
 * @author Pranjali Chaudhari
 * Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers.
 *  (Use String Tokenizer class)
 */
import java.util.*;
public class Exercise1 {
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        int result = sumOfIntegers(s);
        System.out.println("sum of the integers is: " + result);
        sc.close();
	}
        
        
        public static int sumOfIntegers(String list) {
        	int num;
            int sum = 0;
             StringTokenizer st = new StringTokenizer(list, " ");
             while (st.hasMoreTokens()) {
                 String temp = st.nextToken();
                 num = Integer.parseInt(temp);
                 System.out.println(num);
                 sum = sum + num;
             }
             
             return sum;
             
        }
    }

