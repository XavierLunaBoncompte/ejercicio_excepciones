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
public class VariablesNulasException extends OperacionFallidaException {

    /**
     * Creates a new instance of <code>VariableNulaException</code> without
     * detail message.
     */
    public VariablesNulasException() {
    }

    /**
     * Constructs an instance of <code>VariableNulaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public VariablesNulasException(String msg) {
        super(msg);
    }

    public VariablesNulasException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public VariablesNulasException(Throwable thrwbl) {
        super(thrwbl);
    }

    public VariablesNulasException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
