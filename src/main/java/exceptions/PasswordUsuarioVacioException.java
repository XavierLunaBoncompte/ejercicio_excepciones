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
public class PasswordUsuarioVacioException extends UsuarioNoRegistradoException {

    public PasswordUsuarioVacioException() {
    }

    public PasswordUsuarioVacioException(String string) {
        super(string);
    }

    public PasswordUsuarioVacioException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PasswordUsuarioVacioException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PasswordUsuarioVacioException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
