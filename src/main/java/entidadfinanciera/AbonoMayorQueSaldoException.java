/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

/**
 *
 * @author lubo1
 */
public class AbonoMayorQueSaldoException extends Exception {

    /**
     * Creates a new instance of <code>AbonoMayorQueSaldoException</code>
     * without detail message.
     */
    public AbonoMayorQueSaldoException() {
    }

    /**
     * Constructs an instance of <code>AbonoMayorQueSaldoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public AbonoMayorQueSaldoException(String msg) {
        super(msg);
    }

    public AbonoMayorQueSaldoException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public AbonoMayorQueSaldoException(Throwable thrwbl) {
        super(thrwbl);
    }

    public AbonoMayorQueSaldoException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
