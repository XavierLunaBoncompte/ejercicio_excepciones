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
public class LasPasswordsNoCoincidenException extends UsuarioNoRegistradoException {

    public LasPasswordsNoCoincidenException() {
    }

    public LasPasswordsNoCoincidenException(String string) {
        super(string);
    }

    public LasPasswordsNoCoincidenException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public LasPasswordsNoCoincidenException(Throwable thrwbl) {
        super(thrwbl);
    }

    public LasPasswordsNoCoincidenException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
