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
    private CuentaCorrienteACreditoGold instance1;
    private CuentaCorrienteACreditoGold instance2;
    private CuentaCorrienteACreditoGold instance3;
    
    public CuentaCorrienteACreditoGoldTest() {
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
        instance1 = new CuentaCorrienteACreditoGold("Mario", 600.34);
        instance2 = new CuentaCorrienteACreditoGold("Gerard", 1329.65);
        instance3 = new CuentaCorrienteACreditoGold("Laura", 700.99);
    }
    
    @After
    public void tearDown() {
        instance1 = null;
        instance2 = null;
        instance3 = null;
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
        
        instance1.abona(100.34);
        System.out.println("Saldo; " + instance1.getSaldo());
        
        instance2.abona(300.55);
        System.out.println("Saldo; " + instance2.getSaldo());
        
        instance3.abona(20);
        System.out.println("Saldo; " + instance3.getSaldo());
        
        //assertEquals(300, instance1.abona(300.34).getSaldo(), abono);
    }
    
}
