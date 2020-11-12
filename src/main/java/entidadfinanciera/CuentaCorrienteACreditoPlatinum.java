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
public class CuentaCorrienteACreditoPlatinum extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoPlatinum(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * Esta cuenta permite una descubierto de hasta 5000 €, si es más lanza una
     * exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
