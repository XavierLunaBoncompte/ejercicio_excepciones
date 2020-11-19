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
    
    private CuentaCorrienteACreditoPlatinum instance1;
    private CuentaCorrienteACreditoPlatinum instance2;
    private CuentaCorrienteACreditoPlatinum instance3;
    
    public CuentaCorrienteACreditoPlatinumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando test...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando test...");
    }
    
    @Before
    public void setUp() throws Exception {
        instance1 = new CuentaCorrienteACreditoPlatinum("Eloi", 1900);
        instance2 = new CuentaCorrienteACreditoPlatinum("Anna", 500.33);
        instance3 = new CuentaCorrienteACreditoPlatinum("Juan", 890.32);
    }
    
    @After
    public void tearDown() {
        instance1 = null;
        instance2 = null;
        instance3 = null;
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
        
        instance1.abona(20);
        System.out.println("Saldo; " + instance1.getSaldo());
        
        instance2.abona(60);
        System.out.println("Saldo; " + instance2.getSaldo());
        
        instance3.abona(1000);
        System.out.println("Saldo; " + instance3.getSaldo());
    }
    
}
