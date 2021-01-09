package com.org.getSorted.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class getSortedTest {
	
	Sorted list=new Sorted();

	@Test
	public void test_getSorted_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int numbers[]= {};
		int result[]=list.sortArray(numbers);
		assertEquals(numbers,result);
	}
	
	
	@Test
	public void test_getSorted_Given1IntegerArray_ShouldReturn_SortedIntegerArray() {
		int numbers[]= {1};
		int result[]=list.sortArray(numbers);
		assertEquals(1,result[0]);
	}
	@Test
	public void test_getSorted_Given2IntegerArray_ShouldReturn_SortedIntegerArray() {
		int numbers[]= {4,2,6,25,7};
		int result []=list.sortArray(numbers);
		assertEquals(5,result.length);
		
	}

}
