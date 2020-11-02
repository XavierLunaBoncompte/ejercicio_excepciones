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
public class UsuarioNoRegistradoException extends Exception {

    public UsuarioNoRegistradoException() {
    }

    public UsuarioNoRegistradoException(String string) {
        super(string);
    }

    public UsuarioNoRegistradoException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public UsuarioNoRegistradoException(Throwable thrwbl) {
        super(thrwbl);
    }

    public UsuarioNoRegistradoException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
