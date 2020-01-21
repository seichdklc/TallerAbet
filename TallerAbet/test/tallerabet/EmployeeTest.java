/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicoleagila
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCs() {
        System.out.println("cs");
        Employee instance = null;
        assertEquals(0.0F, instance.cs(), 0.0);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonus() {
        System.out.println("CalculateYearBonus");
        Employee instance = null;
        float expResult = 0.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
    }
    
}
