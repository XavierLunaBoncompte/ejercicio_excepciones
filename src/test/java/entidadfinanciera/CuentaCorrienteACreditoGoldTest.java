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
public class CuentaCorrienteACreditoGoldTest {
    
    public CuentaCorrienteACreditoGoldTest() {
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
    
    public void testValidateOperacionCreditoGold() {
        
    }

    /**
     * Test of validateOperacionCreditoGold method, of class CuentaCorrienteACreditoGold.
     */
    @ParameterizedTest
    @ValueSource(strings = {"-1000.35", "333.00", "60000.28"})
    public void testValidateOperacionCreditoGoldTrue(String saldo) {
        assertTrue(CuentaCorrienteACreditoGold.validateOperacionCreditoGold(saldo));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"-", "aaa", "111..", "6t66.88"})
    public void testValidateOperacionCreditoGoldFalse(String saldo) {
        assertFalse(CuentaCorrienteACreditoGold.validateOperacionCreditoGold(saldo));
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoGold.
     */
    @Test
    //@Disabled
    public void testAbona() throws Exception {
        System.out.println(".: PRUEBA DE ABONAR EN LA CUENTA DE CREDITO GOLD :.");
        double abono = 4400.0;
        CuentaCorrienteACreditoGold instance = new CuentaCorrienteACreditoGold("Marc", 1300.34);
        instance.abona(abono);
        System.out.println("Saldo; " + instance.getSaldo());
    }
    
}
