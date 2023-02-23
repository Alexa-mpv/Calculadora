/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora_;

import Calculadora.Metodos;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexa
 */
public class MetodosTest {
    
    public MetodosTest() {
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
     * Test of esDigito method, of class Metodos.
     */
    @Test
    public void testEsDigito() {
        System.out.println("esDigito");
        char car = ' ';
        boolean expResult = false;
        boolean result = Metodos.esDigito(car);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of segmenta method, of class Metodos.
     */
    @Test
    public void testSegmenta() {
        System.out.println("segmenta");
        String cadena = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Metodos.segmenta(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaString method, of class Metodos.
     */
    @Test
    public void testValidaString() {
        System.out.println("validaString");
        ArrayList<String> elementos = null;
        boolean expResult = false;
        boolean result = Metodos.validaString(elementos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prioridadOp method, of class Metodos.
     */
    @Test
    public void testPrioridadOp() {
        System.out.println("prioridadOp");
        String operador = "";
        int expResult = 0;
        int result = Metodos.prioridadOp(operador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirPostfijo method, of class Metodos.
     */
    @Test
    public void testConvertirPostfijo() {
        System.out.println("convertirPostfijo");
        ArrayList<String> infijo = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = Metodos.convertirPostfijo(infijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resuelvePost method, of class Metodos.
     */
    @Test
    public void testResuelvePost() {
        System.out.println("resuelvePost");
        ArrayList<String> exp = null;
        String expResult = "";
        String result = Metodos.resuelvePost(exp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculadora method, of class Metodos.
     */
    @Test
    public void testCalculadora() {
        System.out.println("calculadora");
        String cadena = "";
        String expResult = "";
        String result = Metodos.calculadora(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Metodos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Metodos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
