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
public class DenominadorIgualAZeroException extends OperacionFallidaException {

    /**
     * Creates a new instance of <code>DenominadorIgualAZero</code> without
     * detail message.
     */
    public DenominadorIgualAZeroException() {
    }

    /**
     * Constructs an instance of <code>DenominadorIgualAZero</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DenominadorIgualAZeroException(String msg) {
        super(msg);
    }

    public DenominadorIgualAZeroException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DenominadorIgualAZeroException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DenominadorIgualAZeroException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
