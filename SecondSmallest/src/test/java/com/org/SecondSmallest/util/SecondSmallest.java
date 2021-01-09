package com.org.SecondSmallest.util;

import java.util.Arrays;

public class SecondSmallest {

	public int getSecondSmallest(int[] newNumbers) {
		if(newNumbers.length==0) {
			return 0;
		}
		else if(newNumbers.length==2) {
			return Math.max(newNumbers[0], newNumbers[1]);
		}
		else if(newNumbers.length>2) {
			Arrays.sort(newNumbers);
			return newNumbers[1];
		}
		
		return 1;
	}

}
