/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lubo1
 */
public class CuentaCorrienteADebito extends CuentaCorritenteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) throws Exception {
        super(titular, saldo);
        
        if(saldo < 0) {
            throw new ElSaldoNoPuedeSerNegativo("El saldo no puede ser negativo");        
        }
    }
    
    

    /**
     *
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {

        if (abono > saldo) {
            try {
                throw new AbonoMayorQueSaldoException("El abono no puede ser mayor que el saldo de la cuenta.");
            } catch (AbonoMayorQueSaldoException ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            saldo -= abono;
        }

    }
    

}
