/**
 * @author Pranjali Chaudhari
 * Desc : Create a method to accept date and print the duration 
 * in days, months and years with regards to current system date.
 */
package com.cg.LabThree;
import java.time.*;
import java.util.*;

public class Exercise7 {

	public static void calcDifference(LocalDate current) {
		LocalDate now = LocalDate.now();
		 
        Period diff = Period.between(current, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
		
	}
	public static void main(String[] args)
    {
        LocalDate present = LocalDate.of(2017, 01, 01);
        calcDifference(present);
        
  }
}
