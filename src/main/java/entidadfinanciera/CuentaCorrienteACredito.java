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
public abstract class CuentaCorrienteACredito extends CuentaCorritenteImpl implements Comparable<CuentaCorrienteACredito> {

    public CuentaCorrienteACredito(String titular, double saldo) throws Exception {
        super(titular, saldo);
    }

    @Override
    public int compareTo(CuentaCorrienteACredito t) {
        return this.getTitular().compareTo(t.getTitular());
    }
    
    

}
