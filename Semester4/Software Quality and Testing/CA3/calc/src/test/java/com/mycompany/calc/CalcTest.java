/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tj
 */
public class CalcTest {

    public CalcTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Calc.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calc.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calc.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 3;
        int b = 5;
        int expResult = 8;
        int result = Calc.add(a, b);
        assertEquals(expResult, result,"Test add");
    }

    /**
     * Test of mult method, of class Calc.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        int a = 2;
        int b = 3;
        int expResult = 6;
        int result = Calc.mult(a, b);
        assertEquals(expResult, result,"Test Mult");
    }

    /**
     * Test of div method, of class Calc.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 100;
        int b = 20;
        int expResult = 5;
        int result = Calc.div(a, b);
        assertEquals(expResult, result,"Test Div");
    }

    /**
     * Test of min method, of class Calc.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        int a = 6;
        int b = 5;
        int expResult = 1;
        int result = Calc.min(a, b);
        assertEquals(expResult, result,"Test Min");
    }

    /**
     * Test of carea method, of class Calc.
     */
    @Test
    public void testCarea() {
        System.out.println("carea");
        double r = 2;
        double expResult = 12.56;
        double result = Calc.carea(r);
        assertEquals(expResult, result, 0,"Test Circle Area");
        // TODO review the generated test code and remove the default call to fail.
    }

}
