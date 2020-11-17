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
public abstract class CuentaCorritenteImpl implements CuentaCorriente {

    private String titular;
    protected double saldo;

    public CuentaCorritenteImpl(String titular, double saldo) throws Exception {
        if (titular == " ") {
            throw new NullPointerException("La variable nombre no puede estar vacia");
        }
        this.titular = titular;

        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorritenteImpl{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public void ingresa(double ingreso) {
        if (ingreso <= 0) {
            try {
                throw new ElIngresoNoPuedeSerNegativoOIgualAZeroException("El ingreso tiene que ser mayor que 0.");
            } catch (ElIngresoNoPuedeSerNegativoOIgualAZeroException ex) {
                Logger.getLogger(CuentaCorritenteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            saldo += ingreso;
        }

    }

}
