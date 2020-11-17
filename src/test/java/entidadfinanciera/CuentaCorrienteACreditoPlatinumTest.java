/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

import RegExpr.RegExprMain;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author lubo1
 */
public class CuentaCorrienteACreditoPlatinumTest {
    
    public CuentaCorrienteACreditoPlatinumTest() {
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
     * Test of validateOperacionCreditoPlatinum method, of class CuentaCorrienteACreditoPlatinum.
     */
    @Test
    @Disabled
    public void testValidateOperacionCreditoPlatinum() {
        
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"-300.35", "1500.00", "63000.56"})
    public void testValidateOperacionCreditoPlatinumTrue(String saldo) {
        assertTrue(CuentaCorrienteACreditoPlatinum.validateOperacionCreditoPlatinum(saldo));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"-", "cc.cc", "624..", "876r.r88"})
    public void testValidateOperacionCreditoPlatinumFalse(String saldo) {
        assertFalse(CuentaCorrienteACreditoPlatinum.validateOperacionCreditoPlatinum(saldo));
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoPlatinum.
     */
    @Test
    public void testAbona() throws Exception {
        System.out.println(".: PRUEBA DE ABONAR EN LA CUENTA DE CREDITO PLATINUM :.");
        double abono = 400.0;
        CuentaCorrienteACreditoPlatinum instance = new CuentaCorrienteACreditoPlatinum("Guillem", 1300.34);
        instance.abona(abono);
        System.out.println("Saldo; " + instance.getSaldo());
    }
    
}
