/**
 * Write a Java program that reads a line of integers and  then displays each integer and the sum of 
  all integers.(Use String Tokenizer class).
  * Author : srihari muppalla
 */

package com.org.IntegerSum.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerSumTest {
	IntegerSum integerSum=new IntegerSum();
	@Test
	public void test_sumOfInteger_GivenInput0_ShouldReturn0AsInteger() {
		String input="";
		int result=integerSum.sumOfInteger(input);
		assertEquals(0,result);
	}
	@Test
	public void test_sumOfInteger_GivenSingleDigitInput_ShouldReturnSameDigitAsInteger() {
		String input="1";
		int result=integerSum.sumOfInteger(input);
		assertEquals(1,result);
	}
	@Test
	public void test_sumOfInteger_GivenMoreThan1DigitInput_ShouldReturnSumAsInteger() {
		String input="1 3 5 2 8";
		int result=integerSum.sumOfInteger(input);
		assertEquals(19,result);
	}

}
