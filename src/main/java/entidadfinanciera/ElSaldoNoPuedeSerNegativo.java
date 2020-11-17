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
public class ElSaldoNoPuedeSerNegativo extends Exception {

    /**
     * Creates a new instance of <code>ElSaldoNoPuedeSerNegativo</code> without
     * detail message.
     */
    public ElSaldoNoPuedeSerNegativo() {
    }

    /**
     * Constructs an instance of <code>ElSaldoNoPuedeSerNegativo</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ElSaldoNoPuedeSerNegativo(String msg) {
        super(msg);
    }

    public ElSaldoNoPuedeSerNegativo(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ElSaldoNoPuedeSerNegativo(Throwable thrwbl) {
        super(thrwbl);
    }

    public ElSaldoNoPuedeSerNegativo(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
