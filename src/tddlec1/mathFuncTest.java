/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddlec1;
import org.junit.* ;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
/**
 *
 * @author islam
 */
public class mathFuncTest {
    private mathFunc math ;
    
    @Before
    public void init()
    {
        math = new mathFunc();
    }
    @After
    public void tearDown()
    {
        math = null;
    }
    @Test
    public void test()
    {
        assertEquals(0,math.getCalls());
        math.factorial(1);
        assertEquals(1,math.getCalls());
        math.factorial(1);
        assertEquals(2,math.getCalls());
    }
    @Test
    public void testFactorial()
    {
        assertTrue(math.factorial(0)==1);
        assertTrue(math.factorial(1)==1);
        assertTrue(math.factorial(5)==120);
    }
    @Test (expected = IllegalArgumentException.class)
    public void factorialnegative()
    {
        math.factorial(-1);
    }
    
    @Ignore
    @Test
    public void testPlus()
    {
        assertTrue(math.plus(4, 3)==7);
    }
    
    
    public static void main(String[] args) throws Exception 
    {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(mathFuncTest.class);
        System.out.println("Run tests " + result.getRunCount());
        System.out.println("Failed tests " + result.getFailureCount());
        System.out.println("ignored tests " + result.getIgnoreCount());
        System.out.println("success " + result.wasSuccessful());
    }
    
    
}
