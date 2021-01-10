/**
 *  @author RISHITA CHOUBEY
 *  testing Exercise 2
 */
package com.cg.Lab3;

import static org.junit.Assert.*;


import org.junit.Test;





public class Exercise2Test {
	private Exercise2 exercise2;
    
    
    public void setup()
    {
    	exercise2= new Exercise2(); 
    }
    @Test
    public void test_getImage_GivenString_ShouldReturnNullAsString()
    {
    	StringBuffer sb= new StringBuffer("");
    	StringBuffer result= Exercise2.getImage(sb);
        assertEquals( null, result );
    }
    @Test
    public void test_getImage_GivenSameCharactersInString_ShouldReturnString()
    {
    	StringBuffer sb= new StringBuffer("AAAA");
    	StringBuffer result= Exercise2.getImage(sb);
        assertEquals("AAAA|AAAA", result.toString() );
    }
    @Test
    public void test_getImage_GivenString_ShouldReturnImage()
    {
    	StringBuffer sb= new StringBuffer("EARTH");
    	
    	StringBuffer expected= new StringBuffer("EARTH|HTRAE");
    	StringBuffer result= Exercise2.getImage(sb);
    	
        assertEquals( expected.toString(), result.toString());
    }
}
