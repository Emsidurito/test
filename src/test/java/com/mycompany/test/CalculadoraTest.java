/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DeMo12
 */
public class CalculadoraTest {
    

    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
