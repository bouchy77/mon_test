package com.myTest.test.mon_test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	App a = new App();
    	App b = new App();
    	this.assertEquals(10,a.maxi(10,5));
    	this.assertEquals(2,b.fact(5));
    	this.assertEquals(4,b.fact(5));
       
    }
}
