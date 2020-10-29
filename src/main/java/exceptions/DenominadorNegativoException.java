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
public class DenominadorNegativoException extends OperacionFallidaException {

    /**
     * Creates a new instance of <code>DenominadorNegativoException</code>
     * without detail message.
     */
    public DenominadorNegativoException() {
    }

    /**
     * Constructs an instance of <code>DenominadorNegativoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DenominadorNegativoException(String msg) {
        super(msg);
    }

    public DenominadorNegativoException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DenominadorNegativoException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DenominadorNegativoException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
