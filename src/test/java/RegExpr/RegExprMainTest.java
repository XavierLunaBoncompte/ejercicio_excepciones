/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//import org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lubo1
 */
public class RegExprMainTest {

    public RegExprMainTest() {
    }

    //Abans de tots els test
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inciant tests");
    }
    //Al final de tots els tests
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant tests");
    }

    //Abans de cada test
    @Before
    public void setUp() {
    }
    //Al final de cada test
    @After
    public void tearDown() {
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"23456789B", "23456789C"})
    void testValidateNifTrue(String nif) {
        assertTrue(RegExprMain.validateNIF(nif));
    }
    
        /**
     * Test of ValidateNif method, of class RegExprMain.
     */
    @ParameterizedTest
    @ValueSource(strings = {"23456789A", "23456789"})
    void testValidateNifFalse(String nif) {
        assertFalse(RegExprMain.validateNIF(nif));
    }

    /**
     * Test of validateNIF method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateNIF() {
        assertTrue(RegExprMain.validateNIF("46098494P"));
        assertFalse(RegExprMain.validateNIF("46098494A"));
        assertTrue(RegExprMain.validateNIF("43267890C"));
        assertFalse(RegExprMain.validateNIF("46098494A"));
        assertFalse(RegExprMain.validateNIF("4609844AA"));
        assertFalse(RegExprMain.validateNIF("4609844A"));
        assertTrue(RegExprMain.validateNIF("45678932D"));
        assertTrue(RegExprMain.validateNIF("41256789S"));
        assertFalse(RegExprMain.validateNIF("460984943A"));
        assertFalse(RegExprMain.validateNIF("46098494"));

    }

    /**
     * Test of validateTLF method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateTLF() {
        assertTrue(RegExprMain.validateTLF("622 24 64 59"));
        assertTrue(RegExprMain.validateTLF("634 84 34 54"));
        assertTrue(RegExprMain.validateTLF("645 74 44 53"));
        assertFalse(RegExprMain.validateTLF("656 154 54 56"));
        assertTrue(RegExprMain.validateTLF("656 14 54 56"));
        assertTrue(RegExprMain.validateTLF("667 54 74 55"));
        assertFalse(RegExprMain.validateTLF("656 16 5 56"));
        assertFalse(RegExprMain.validateTLF("656 15A 54 56"));
        assertTrue(RegExprMain.validateTLF("611 34 84 57"));
        assertFalse(RegExprMain.validateTLF("6564 15 54 56"));
          

    }

    /**
     * Test of validateTLFEspañol method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateTLFEspañol() {
        assertFalse(RegExprMain.validateTLFEspañol("+33 6 55 61 32"));
        assertTrue(RegExprMain.validateTLFEspañol("+34 622 24 64 59"));
        assertTrue(RegExprMain.validateTLFEspañol("+34 611 23 43 11"));
        assertTrue(RegExprMain.validateTLFEspañol("+34 632 55 61 32"));
        assertFalse(RegExprMain.validateTLFEspañol("+31 632 55 6 32"));
        assertFalse(RegExprMain.validateTLFEspañol("+34 632 5 61 32"));
        assertFalse(RegExprMain.validateTLFEspañol("+40 632 55 619 3"));
        assertFalse(RegExprMain.validateTLFEspañol("+33 632 55 61 32"));
        assertFalse(RegExprMain.validateTLFEspañol("632 55 61 32"));
        
        

    }

    /**
     * Test of validateMatriculaCoche method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateMatriculaCoche() {
        assertFalse(RegExprMain.validateMatriculaCoche("543 JTD"));
        assertTrue(RegExprMain.validateMatriculaCoche("5432 JTD"));
        assertFalse(RegExprMain.validateMatriculaCoche("5433 JAD"));
        assertFalse(RegExprMain.validateMatriculaCoche("54333 JTD"));
        assertTrue(RegExprMain.validateMatriculaCoche("5432 JTD"));
        assertTrue(RegExprMain.validateMatriculaCoche("6784 CLD"));
        assertTrue(RegExprMain.validateMatriculaCoche("4563 BVB"));
        assertTrue(RegExprMain.validateMatriculaCoche("6789 LMN"));
        assertTrue(RegExprMain.validateMatriculaCoche("2435 JKD"));
        assertTrue(RegExprMain.validateMatriculaCoche("4567 GJD"));
        

    }

    /**
     * Test of validateFecha method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateFecha() {
        assertTrue(RegExprMain.validateFecha("10/06/2022"));
        assertTrue(RegExprMain.validateFecha("10/06/2011"));
        assertTrue(RegExprMain.validateFecha("10/06/2015"));
        assertTrue(RegExprMain.validateFecha("10/06/2016"));
        assertTrue(RegExprMain.validateFecha("10/06/2021"));
        assertTrue(RegExprMain.validateFecha("10/06/1999"));
        assertTrue(RegExprMain.validateFecha("10/06/2007"));
        assertTrue(RegExprMain.validateFecha("10/06/2000"));
        assertTrue(RegExprMain.validateFecha("10/06/2002"));
        assertFalse(RegExprMain.validateFecha("38/06/2009"));
        assertFalse(RegExprMain.validateFecha("10/20/2010"));
        
        

    }

    /**
     * Test of validateEmail method, of class RegExprMain.
     */
    @Test
    //@Disabled
    public void testValidateEmail() {
        assertTrue(RegExprMain.validateEmail("lubo.xaviluna@gmail.com"));
        assertTrue(RegExprMain.validateEmail("lubo26@gmail.com"));
        assertTrue(RegExprMain.validateEmail("lubo_xaviluna@gmail.com"));
        assertTrue(RegExprMain.validateEmail("lubo06.xaviluna@gmail.com"));
        assertFalse(RegExprMain.validateEmail("lubo@gmail.com6"));
        assertFalse(RegExprMain.validateEmail("luna@gmail"));
        assertFalse(RegExprMain.validateEmail("xaviluna@gmail0.com"));
        assertFalse(RegExprMain.validateEmail("lubo.xaviluna@gmai_l.com"));
        assertTrue(RegExprMain.validateEmail("luna#xavi@gmail.com"));
        assertTrue(RegExprMain.validateEmail(".xaviluna@gmail.com"));
        
        

    }

    /**
     * Test of validateFormat method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateFormat() {
        assertTrue(RegExprMain.validateFormat("CC222CC"));
        assertTrue(RegExprMain.validateFormat("DD333DD"));
        assertTrue(RegExprMain.validateFormat("AA999AA"));
        assertTrue(RegExprMain.validateFormat("VV555VV"));
        assertTrue(RegExprMain.validateFormat("JJ777JJ"));
        assertFalse(RegExprMain.validateFormat("J777JJ"));
        assertFalse(RegExprMain.validateFormat("JJ777J"));
        assertFalse(RegExprMain.validateFormat("JJ77JJ"));
        assertFalse(RegExprMain.validateFormat("JJ777AA"));
        assertFalse(RegExprMain.validateFormat("AA777JJ"));
        

    }

}

//        assertAll("nifs",
//                () -> {
//                    assertTrue(RegExprMain.ValidateNif("23456789B"));
//                },
//                () -> {
//                    assertTrue(RegExprMain.ValidateNif("23456789B"));
//                });
