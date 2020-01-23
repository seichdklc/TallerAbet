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
    public void testCsManager(){
        Employee instance1 = new Employee(10.00F,"USD",5, EmployeeType.Manager);
        assertEquals(77.83F, instance1.cs(), 0.5);        
    }
    
    @Test
    public void testCsSupervisor(){
        Employee instance2 = new Employee(10.00F,"USD",5, EmployeeType.Supervisor);
        assertEquals(76.08F, instance2.cs(), 0.5);
    }
    
    @Test
    public void testCsWorker(){
        Employee instance3 = new Employee(10.00F,"USD",5, EmployeeType.Worker);
        assertEquals(74.33F, instance3.cs(), 0.5);
        
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
  
    
    @Test 
    public void testCalculateYearBonusManager(){
         Employee instance4 = new Employee(15.00F,"USD",5, EmployeeType.Manager);
         float expResult=401.00F;
         assertEquals(401.00F,instance4.CalculateYearBonus(),0.5);
    }
    
    @Test 
    public void testCalculateYearBonusSupervisor(){
         Employee instance5 = new Employee(12.00F,"USD",5, EmployeeType.Supervisor);
         float expResult=205.00F;
         assertEquals(205.00F,instance5.CalculateYearBonus(),0.5);
    }
    
    @Test 
    public void testCalculateYearBonusWorker(){
         Employee instance6 = new Employee(10.00F,"USD",5, EmployeeType.Worker);
         float expResult=386.00F;
         assertEquals(386.00F,instance6.CalculateYearBonus(),0.5);
    }
    
    
    
}
