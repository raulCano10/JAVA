/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nuevoproyecto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author raul
 */
public class VehiculoTest {
    
    public VehiculoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        //Esta es la primera función que se ejecuta al lanzar mi fichero de test.
    }
    
    @AfterAll
    public static void tearDownClass() {
        //Ultima que se ejecuta al finalizar mis test.
    }
    
    @BeforeEach
    public void setUp() {
        //Se ejecuta antes de comenzar cada prueba de TEST
    }
    
    @AfterEach
    public void tearDown() {
        //Se ejecuta al finalizr cada prueba de TEST
    }

    /**
     * Test of getNumeroRuedas method, of class Vehiculo.
     */
    //Cada prueba @TEST es una un prueba individual
    @Test
    public void testGetNumeroRuedas() {
        System.out.println("getNumeroRuedas");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getNumeroRuedas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Vehiculo.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Vehiculo.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Vehiculo.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroRuedas method, of class Vehiculo.
     */
    @Test
    public void testSetNumeroRuedas() {
        System.out.println("setNumeroRuedas");
        int numeroRuedas = 0;
        Vehiculo instance = new Vehiculo();
        instance.setNumeroRuedas(numeroRuedas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Vehiculo.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Vehiculo instance = new Vehiculo();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Vehiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Vehiculo instance = new Vehiculo();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Vehiculo.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Vehiculo instance = new Vehiculo();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
