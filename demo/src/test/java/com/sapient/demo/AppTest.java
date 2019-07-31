package com.sapient.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   public void testCase1()
   {
	   String expected="welcome to java bro!!!!!!!!";
	   App ob = new App();
	   String val= ob.myFunction();
	   assertEquals(expected, val);
   }
}
