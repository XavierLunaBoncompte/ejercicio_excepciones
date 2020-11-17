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
public class ElIngresoNoPuedeSerNegativoOIgualAZeroException extends Exception {

    public ElIngresoNoPuedeSerNegativoOIgualAZeroException() {
    }

    public ElIngresoNoPuedeSerNegativoOIgualAZeroException(String msg) {
        super(msg);
    }

    public ElIngresoNoPuedeSerNegativoOIgualAZeroException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ElIngresoNoPuedeSerNegativoOIgualAZeroException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ElIngresoNoPuedeSerNegativoOIgualAZeroException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
