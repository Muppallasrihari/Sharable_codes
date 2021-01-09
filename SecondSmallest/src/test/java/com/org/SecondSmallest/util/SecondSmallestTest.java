package com.org.SecondSmallest.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondSmallestTest {
	
	SecondSmallest smallest=new SecondSmallest();

	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReurn0AsInteger() {
	    int  newNumbers[]= {};
		int result=  smallest.getSecondSmallest(newNumbers);
		  assertEquals(0, result);
		  
		}
	@Test
	public void test_getSecondSmallest_Given1IntegerArray_ShouldReurn1AsInteger() {
	    int  newNumbers[]= {1};
		int result=  smallest.getSecondSmallest(newNumbers);
		  assertEquals(1, result);
		  
		}
	@Test
	public void test_getSecondSmallest_GivenMoreThan1IntegerArray_ShouldReurn1AsInteger()  {
	    int  newNumbers[]= {3,6,1,4};
		int result=  smallest.getSecondSmallest(newNumbers);
		  assertEquals(3, result);
		  
		}



}
