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
public class NombreUsuarioVacioException extends UsuarioNoRegistradoException {

    public NombreUsuarioVacioException() {
    }

    public NombreUsuarioVacioException(String string) {
        super(string);
    }

    public NombreUsuarioVacioException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public NombreUsuarioVacioException(Throwable thrwbl) {
        super(thrwbl);
    }

    public NombreUsuarioVacioException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
