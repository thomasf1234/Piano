/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ad
 */
public class IntervalTest {
    
    public IntervalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStartTime method, of class Interval.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        Interval instance = new Interval(3, 10);
        int expResult = 3;
        int result = instance.getStartTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEndTime method, of class Interval.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        Interval instance = new Interval(3, 10);
        int expResult = 10;
        int result = instance.getEndTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class Interval.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Interval instance = new Interval(3, 10);
        int expResult = 7;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }
    
}
