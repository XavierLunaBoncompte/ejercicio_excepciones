/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lubo1
 */
public class CuentaCorrienteACreditoGold extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoGold(String titular, double saldo) throws Exception {
        super(titular, saldo);

        if (saldo < 0) {
            throw new Exception("El saldo no puede ser menor que 0", new IllegalArgumentException());
        }
    }

    public static boolean validateOperacionCreditoGold(String posibleOperacion) {
        Pattern p = Pattern.compile("^[0-9]+(\\.?[0-9]*)|^-?\\d+(?:\\.\\d+)"); //|^-?\\d+(?:\\.\\d+)
        Matcher m = p.matcher(posibleOperacion);

        return m.matches();

    }

    /**
     * Esta cuenta permite una descubierto de hasta 3000 €, si es más lanza una
     * exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {
        double mSaldo = saldo;
        double mPosibleSaldo = mSaldo - abono;

        String conversion = String.valueOf(mPosibleSaldo);

        boolean validacionOperacionBancaria = validateOperacionCreditoGold(conversion);

        if (validacionOperacionBancaria == false) {
            try {
                throw new Exception("La operacion no ha sido validada.");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            if (mPosibleSaldo + 3000 <= 0) {
                try {
                    throw new AbonoMayorQueSaldoException("El abono no puede ser mayor que el saldo de la cuenta + el descubierto admitido de 3000 euros.");
                } catch (AbonoMayorQueSaldoException ex) {
                    Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                saldo -= abono;
            }

        }

        /*double mSaldo = this.getSaldo();

        if (abono > (mSaldo + 3000)) {
            try {
                throw new AbonoMayorQueSaldoException("El abono no puede ser mayor que el saldo de la cuenta + el descubierto admitido.");
            } catch (AbonoMayorQueSaldoException ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            mSaldo -= abono;
        }*/
    }

}
