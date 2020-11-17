/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lubo1
 */
public class CuentaCorrienteADebitoTest {
    
    public CuentaCorrienteADebitoTest() {
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
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    public void testAbona() throws Exception {
        System.out.println(".: PRUEBA DE ABONAR EN LA CUENTA DE DEBITO :.");
        double abono = 300.0;
        CuentaCorrienteADebito instance = new CuentaCorrienteADebito("David", 1300.34);
        instance.abona(abono);
        System.out.println("Saldo; " + instance.getSaldo());
        
    }
    
}
