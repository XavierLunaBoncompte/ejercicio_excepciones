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
public class OperacionFallidaException extends Exception {

    /**
     * Creates a new instance of <code>OperacionFallidaException</code> without
     * detail message.
     */
    public OperacionFallidaException() {
    }

    /**
     * Constructs an instance of <code>OperacionFallidaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OperacionFallidaException(String msg) {
        super(msg);
    }

    public OperacionFallidaException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public OperacionFallidaException(Throwable thrwbl) {
        super(thrwbl);
    }

    public OperacionFallidaException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
