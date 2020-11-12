/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lubo1
 */
public class RegExprMain {
    
    public static boolean validateNIF(String nif) {
        Pattern p = Pattern.compile("\\d{8}[A-Z&&[^AEIOU]]"); 
        Matcher m = p.matcher(nif);
        
        return m.matches();
        
    } 
    
    static boolean validateNIE(String nie) {
        Pattern p = Pattern.compile("[A-Z]\\d{7}[A-Z]");
        Matcher m = p.matcher(nie);
        return m.matches();
    }
    
    public static boolean validateTLF(String tlf) {
        Pattern p = Pattern.compile("\\d{3}\\s\\d{2}\\s\\d{2}\\s\\d{2}"); 
        Matcher m = p.matcher(tlf);
        
        return m.matches();
        
    } 
    
    public static boolean validateTLFEspañol(String tlfE) {
        Pattern p = Pattern.compile("\\+34\\s\\d{3}\\s\\d{2}\\s\\d{2}\\s\\d{2}"); 
        Matcher m = p.matcher(tlfE);
        
        return m.matches();
        
    } 
    
    public static boolean validateMatriculaCoche(String matricula) {
        Pattern p = Pattern.compile("\\d{4}\\s[A-Z&&[^AEIOU]]{3}"); 
        Matcher m = p.matcher(matricula);
        
        return m.matches();
        
    } 
    
    public static boolean validateFecha(String fecha) {
        Pattern p = Pattern.compile("(0[1-9]|[12][0-9]|^3[01])\\/(0[1-9]|1[012])\\/[0-9]{4}"); 
        Matcher m = p.matcher(fecha);
        
        return m.matches();
        
    } 
    
    public static boolean validateEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9#._-]+@[a-zA-Z]+(\\.[a-zA-Z]+)$"); 
        Matcher m = p.matcher(email);
        
        return m.matches();
        
    } 
    
    public static boolean validateFormat(String format) {
        Pattern p = Pattern.compile("^((\\p{Alpha}{2})(\\d{3}))\\2$"); 
        Matcher m = p.matcher(format);
        
        return m.matches();
        
    } 

    /**
     * Expresion reglar que valide NIF 8digitos y una mayuscula
     * 
     * Expresion regular que valide telefono de mobil
     * 
     * Expresion regular que valide un telefono de España
     * 
     * Expresion regular que valide matriculas de coche actuales 4 digitos 3 letras que no sean vocales
     * 
     * Expresion regular que valide una fecha formato dd/mm/aaaa
     * 
     * Expresion regular que valide un email
     * 
     * Expresion regular que valide una clave ne forma AA999AA.
     */
    public static void main(String[] args) {
        
        //VALIDAR NIF
        
        System.out.println("VALIDAR NIF;\n");
        
        String nif = "46298456P";
        String nif2 = "46298456";
        String nif3 = "46298P68P";
        
        boolean validarNif = validateNIF(nif);
        boolean validarNif2 = validateNIF(nif2);
        boolean validarNif3 = validateNIF(nif3);
        
        System.out.println(nif + "; " + validarNif);
        System.out.println(nif2 + "; " + validarNif2);
        System.out.println(nif3 + "; " + validarNif3 + "\n");
        
        //VALIDAR NIE
        
        System.out.println("VALIDAR NIF;\n");
        
        String nie = "K4629846P";
        
        boolean validarNie = validateNIE(nie);
        
        System.out.println(nie + "; " + validarNie + "\n");
        
        //VALIDAR TELEFONO MOBIL
        
        System.out.println("VALIDAR TELEFONO MOBIL;\n");
        
        String tlf3 = "655P 44 33 45";
        String tlf = "622 24 64 59";
        String tlf2 = "633 444 56 78";
        
        boolean validarTlf = validateTLF(tlf);
        boolean validarTlf2 = validateTLF(tlf2);
        boolean validarTlf3 = validateTLF(tlf3);
        
        System.out.println(tlf2 + "; " + validarTlf2);
        System.out.println(tlf + "; " + validarTlf);
        System.out.println(tlf3 + "; " + validarTlf3 + "\n");
        
        //VALIDAR TELEFON MOBIL ESPAÑOL
        
        System.out.println("VALIDAR TELEFONO MOBIL ESPAÑOL;\n");
        
        String tlfE = "+36 622 24 64 59";
        String tlfE2 = "+32 655 44 33 45";
        String tlfE3 = "+34 633 44 56 78";
        
        boolean validarTlfE = validateTLFEspañol(tlfE);
        boolean validarTlfE2 = validateTLFEspañol(tlfE2);
        boolean validarTlfE3 = validateTLFEspañol(tlfE3);
        
        System.out.println(tlfE + "; " + validarTlfE);
        System.out.println(tlfE2 + "; " + validarTlfE2);
        System.out.println(tlfE3 + "; " + validarTlfE3 + "\n");
        
        //VALIDAR MATRICULA COCHE
        
        System.out.println("VALIDAR MATRICULA COCHE;\n");
        
        String matricula = "54444 JSF";
        String matricula2 = "7575 JTD";
        String matricula3 = "7677 JAD";
        
        boolean validarMatricula = validateMatriculaCoche(matricula);
        boolean validarMatricula2 = validateMatriculaCoche(matricula2);
        boolean validarMatricula3 = validateMatriculaCoche(matricula3);
        
        System.out.println(matricula + "; " + validarMatricula);
        System.out.println(matricula2 + "; " + validarMatricula2);
        System.out.println(matricula3 + "; " + validarMatricula3 + "\n");
        
        //VALIDAR FECHA
        
        System.out.println("VALIDAR FECHA;\n");
        
        String fecha = "28/06/2010";
        String fecha2 = "38/26/2010";
        
        boolean validarFecha = validateFecha(fecha);
        boolean validarFecha2 = validateFecha(fecha2);
        
        System.out.println(fecha + "; " + validarFecha);
        System.out.println(fecha2 + "; " + validarFecha2 + "\n");
        
        //VALIDAR EMAIL
        
        System.out.println("VALIDAR EMAIL;\n");
        
        String email = "lubo.xaviluna@gmail.com";
        
        boolean validarEmail = validateEmail(email);

        System.out.println(email + "; " + validarEmail + "\n");
        
        //VALIDSR FORMAT
        
        System.out.println("VALIDAR FORMAT;\n");
        
        String format = "AA999AA";
        
        boolean validarFormat = validateFormat(format);

        System.out.println(format + "; " + validarFormat);
        
        
        
        /*Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
        System.out.println(b);*

 /*Pattern p = Pattern.compile("[abc]d");
        Matcher m = p.matcher("ad");
        boolean b = m.matches();
        System.out.println(b);*/
 
 /*Pattern p = Pattern.compile("[a-z&&[^m-p]]0");
        Matcher m = p.matcher("a0");
        Matcher m1 = p.matcher("m0");
        boolean b = m.matches();
        boolean b1 = m1.matches();
        System.out.println(b);
        System.out.println(b1);*/
 
//        Pattern p = Pattern.compile("[0-9]\\d");
//        Matcher m = p.matcher("10");
//        Matcher m1 = p.matcher("m0");
//        boolean b = m.matches();
//        boolean b1 = m1.matches();
//        System.out.println(b);
//        System.out.println(b1);

//        Pattern p = Pattern.compile("[0-9]\\D");
//        Matcher m = p.matcher("10");
//        Matcher m1 = p.matcher("m0");
//        boolean b = m.matches();
//        boolean b1 = m1.matches();
//        System.out.println(b);
//        System.out.println(b1);

//        Pattern p = Pattern.compile("\\d{5}");
//        Matcher m = p.matcher("08224");
//        Matcher m1 = p.matcher("082245");
//        boolean b = m.matches();
//        boolean b1 = m1.matches();
//        System.out.println(b);
//        System.out.println(b1);

//        Pattern p = Pattern.compile("\\p{Lower}"); //\\p{Digit}
//        Matcher m = p.matcher("ana");
//        Matcher m1 = p.matcher("Ana");
//        boolean b = m.matches();
//        boolean b1 = m1.matches();
//        System.out.println(b);
//        System.out.println(b1);
    }


}
