/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nci.sqt1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author eoin0
 */
public class SQT1Test {

    public SQT1Test() {
    }
//assertEquals(expResult, result);
    /**
     * Test of sum method, of class SQT1.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int a = 1;
        int b = 3;
        SQT1 instance = new SQT1();
        int expResult = 14;
        int result = instance.sum(a, b);
        assertEquals(expResult, result, "Sum is incorrect");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiply method, of class SQT1.
     */
    @org.junit.jupiter.api.Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 2;
        int b = 5;
        SQT1 instance = new SQT1();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result,"Answer is not expected");
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of HelloWorld method, of class SQT1.
     */
    @Test
    public void testHelloWorld() {
        System.out.println("Hello World");
        SQT1 instance = new SQT1();
        String expResult = "Hello World!";
        String result = instance.HelloWorld();
        assertEquals(expResult, result,"String is not correct");
        // TODO review the generated test code and remove the default call to fail.

    }

}
