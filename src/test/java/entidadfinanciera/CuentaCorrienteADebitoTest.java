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

    private CuentaCorrienteADebito instance1;
    private CuentaCorrienteADebito instance2;
    private CuentaCorrienteADebito instance3;

    public CuentaCorrienteADebitoTest() {
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
        instance1 = new CuentaCorrienteADebito("Oriol", 60);
        instance2 = new CuentaCorrienteADebito("Xavier", 856.76);
        instance3 = new CuentaCorrienteADebito("Maria", 2000.99);
    }

    @After
    public void tearDown() {
        instance1 = null;
        instance2 = null;
        instance3 = null;
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

        instance1.abona(100);
        System.out.println("Saldo; " + instance1.getSaldo());

        instance2.abona(30);
        System.out.println("Saldo; " + instance2.getSaldo());

        instance3.abona(577.99);
        System.out.println("Saldo; " + instance3.getSaldo());

    }

}
