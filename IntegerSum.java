<<<<<<< HEAD
/**
 * Write a Java program that reads a line of integers and  then displays each integer and the sum of 
  all integers.(Use String Tokenizer class).
  * Author : srihari muppalla
 */

package com.org.IntegerSum.util;

import java.util.StringTokenizer;

public class IntegerSum {

	public int sumOfInteger(String input) {
		StringTokenizer strToken = new StringTokenizer(input," ");
		int sum=0;
		while(strToken.hasMoreTokens()) {
			String number=strToken.nextToken();
			sum+=Integer.parseInt(number);
		}
		return sum;
	}

}
=======
/**
 * Write a Java program that reads a line of integers and  then displays each integer and the sum of 
  all integers.(Use String Tokenizer class).
  * Author : srihari muppalla
 */

package com.org.IntegerSum.util;

import java.util.StringTokenizer;

public class IntegerSum {

	public int sumOfInteger(String input) {
		StringTokenizer strToken = new StringTokenizer(input," ");
		int sum=0;
		while(strToken.hasMoreTokens()) {
			String number=strToken.nextToken();
			sum+=Integer.parseInt(number);
		}
		return sum;
	}

}
>>>>>>> 2f87ae792bfa6b3b094c9b180ae6d3329e96cfb7
