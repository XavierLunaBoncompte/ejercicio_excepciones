/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpr.calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author lubo1
 */
public class CalculadoraDeFraccionesTest {

    private CalculadoraDeFracciones instance;
    private CalculadoraDeFracciones instance2;
    private CalculadoraDeFracciones instance3;

    public CalculadoraDeFraccionesTest() {
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
    public void setUp() {
        Fraccion f1 = new Fraccion(3, 3);
        Fraccion f2 = new Fraccion(2, 3);
        instance = new CalculadoraDeFracciones(f1, f2);

        Fraccion f3 = new Fraccion(7, 2);
        Fraccion f4 = new Fraccion(1, 3);
        instance2 = new CalculadoraDeFracciones(f3, f4);

        Fraccion f5 = new Fraccion(6, 2);
        Fraccion f6 = new Fraccion(4, 5);
        instance2 = new CalculadoraDeFracciones(f5, f6);

    }

    @After
    public void tearDown() {
        instance = null;
        instance2 = null;
        instance3 = null;
    }

    /**
     * Test of suma method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testSuma() {
        assertEquals(new Fraccion(5.0, 3.0), instance.suma());
        assertEquals(new Fraccion(23.0, 6.0), instance2.suma());
        assertEquals(new Fraccion(19.0, 5.0), instance3.suma());

    }

    /**
     * Test of resta method, of class CalculadoraDeFracciones.
     */
    @Test
    @Disabled
    public void testResta() {
        assertEquals(new Fraccion(3.0, 9.0), instance.resta());
        assertEquals(new Fraccion(19.0, 6.0), instance2.resta());
        assertEquals(new Fraccion(11.0, 5.0), instance3.resta());

    }

    /**
     * Test of producto method, of class CalculadoraDeFracciones.
     */
    @Test
    @Disabled
    public void testProducto() {
        assertEquals(new Fraccion(2.0, 3.0), instance.producto());
        assertEquals(new Fraccion(7.0, 6.0), instance2.producto());
        assertEquals(new Fraccion(12.0, 5.0), instance3.producto());
    }

    /**
     * Test of division method, of class CalculadoraDeFracciones.
     */
    @Test
    @Disabled
    public void testDivision() {
        assertEquals(new Fraccion(3.0, 2.0), instance.division());
        assertEquals(new Fraccion(21.0, 2.0), instance2.division());
        assertEquals(new Fraccion(15.0, 4.0), instance3.division());
    }

    /**
     * Test of mcd method, of class CalculadoraDeFracciones.
     */
    @Test
    @Disabled
    public void testMcd() {
        assertEquals(2.0, instance.mcd(24.0, 10.0), 1.0E-3);
    }

    /**
     * Test of simplificacion method, of class CalculadoraDeFracciones.
     */
    @Test
    @Disabled
    public void testSimplificacion() {
        assertEquals(new Fraccion(3.0, 2.0), instance.simplificacion(new Fraccion(instance.division().getNumerador(), instance.division().getDenominador())));
        assertEquals(new Fraccion(21.0, 2.0), instance2.simplificacion(new Fraccion(instance2.division().getNumerador(), instance2.division().getDenominador())));
        assertEquals(new Fraccion(15.0, 4.0), instance3.simplificacion(new Fraccion(instance3.division().getNumerador(), instance3.division().getDenominador())));
    }

}
