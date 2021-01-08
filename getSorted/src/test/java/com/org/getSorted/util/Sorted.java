package com.org.getSorted.util;

import java.util.Arrays;

public class Sorted {

	public int sortArray(int[] numbers) {
		if(numbers.length==0) {
			return 0;
		}
		else if(numbers.length>1) {
			Arrays.sort(numbers);
			return numbers[0];
		}
		return numbers[0];
	}

	public int sortArray1(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length-1];
	}


}
