/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static void main(String[] args) throws UsuarioNoRegistradoException {

        try {
            Scanner in = new Scanner(System.in);

            String nombre = "";
            int psw = 0;
            int psw2 = 0;

            System.out.println("Nombre; ");
            nombre = in.nextLine();

            System.out.println("Password; ");
            psw = in.nextInt();

            System.out.println("Confirma la password; ");
            psw2 = in.nextInt();

            Usuario u = new Usuario(nombre, psw, psw2);

        } catch (UsuarioNoRegistradoException ex) {
            Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*try {
            System.out.println(readFirstLineFromFile("data.txt"));
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }*/

 /*double d = 0;
        try {
            d = division(3, 0);
            System.out.println(d);
            
        }catch (Exception ex) {
            ex.getMessage();
        } finally {
            if (d == 3) { 
                System.out.println("Resultado es igual a 3");
                 
            } else { 
                System.out.println("Resultado diferente");
            } 
        }*/
    }

}
