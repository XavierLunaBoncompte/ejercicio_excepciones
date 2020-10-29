/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author lubo1
 */
public class ElFicheroNoExisteException extends Exception {

    /**
     * Creates a new instance of <code>ElFicheroNoExisteException</code> without
     * detail message.
     */
    public ElFicheroNoExisteException() {
    }

    /**
     * Constructs an instance of <code>ElFicheroNoExisteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ElFicheroNoExisteException(String msg) {
        super(msg);
    }

    public ElFicheroNoExisteException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ElFicheroNoExisteException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ElFicheroNoExisteException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
