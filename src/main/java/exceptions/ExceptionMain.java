/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lubo1 Excepciones Run... son excepciones unchecked , es decir no
 * necesitan try-catch. Las demas si.
 *
 */
public class ExceptionMain {

    static double division(double a, double b) throws Exception {

        //Chained exceptions
        if (b == 0) {
            throw new Exception("denominador no puede ser 0", new IllegalArgumentException());
        }
        return a / b;

    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br
                = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
    
   

    public static void main(String[] args) {
        int n = 3;
        int d = -1;
        
        try {
            int operacion = n / d;
            
            if (d < 0) {
                throw new DenominadorNegativoException("El denominador no puede ser negativo");
            } else if (d == 0) {
                throw new DenominadorIgualAZeroException("El denominador no puede ser zero");
            } else if (d == 0 || n == 0) {
                throw new VariablesNulasException("Las variables no pueden ser nulas");
            } else {
                System.out.println("Todo correcto");
            }
            
        } catch (OperacionFallidaException e) {
            e.getMessage();
        }

        /*try {
            System.out.println(readFirstLineFromFile("data.txt"));
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }*/

        /*double d = 0;
        try {
            d = division(3, 1);
            System.out.println(d);
            
        }catch (Exception ex) {
            ex.getMessage();
        } finally {
            if (d == 3) { 
                Sysouttem.out.println("Resultado es igual a 3");
                 
            } else { 
                System.out.println("Resultado diferente");
            } 
        } */
    }

}
