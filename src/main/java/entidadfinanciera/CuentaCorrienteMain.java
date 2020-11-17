/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadfinanciera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CuentaCorrienteDebitoSaldoComparator implements Comparator<CuentaCorrienteADebito> {

    @Override
    public int compare(CuentaCorrienteADebito t, CuentaCorrienteADebito t1) {
        if (t.getSaldo() < t1.getSaldo()) {
            return -1;
        } else if (t.getSaldo() == t1.getSaldo()) {
            return 0;
        } else {
            return 1;
        }
    }
}

/**
 *
 * @author lubo1
 */
public class CuentaCorrienteMain<T>{
    
    private List<T> cuentas = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        List<CuentaCorrienteADebito> cuentasDebito = new ArrayList<>();
        List<CuentaCorrienteACredito> cuentasCredito = new ArrayList<>();

        CuentaCorrienteACredito cG1 = new CuentaCorrienteACreditoGold("Guillem", 100.50);
        cG1.ingresa(3000.25);
        cG1.abona(500.25);
        double saldoActualCreditoGold = cG1.getSaldo();
        System.out.println("El saldo actual de la cuenta Gold es de; " + saldoActualCreditoGold);
        cuentasCredito.add(cG1);

        CuentaCorrienteACredito cP1 = new CuentaCorrienteACreditoPlatinum("Marc", 150.50);
        cP1.abona(6000.25);
        double saldoActualCreditoPlatinum = cP1.getSaldo();
        System.out.println("El saldo actual de la cuenta Platinum es de; " + saldoActualCreditoPlatinum);
        cP1.getSaldo();
        cuentasCredito.add(cP1);

        Collections.sort(cuentasCredito);
        System.out.println(cuentasCredito);

        CuentaCorrienteADebito cD1 = new CuentaCorrienteADebito("David", 1000.50);
        cD1.abona(100.25);
        double saldoActualDebito = cD1.getSaldo();
        System.out.println("El saldo actual de la cuenta de Debito es de; " + saldoActualDebito);
        cuentasDebito.add(cD1);

        CuentaCorrienteADebito cD2 = new CuentaCorrienteADebito("Eloi", 800.50);
        cD2.abona(400.25);
        double saldoActualDebito2 = cD2.getSaldo();
        System.out.println("El saldo actual de la cuenta de Debito es de; " + saldoActualDebito2);
        cuentasDebito.add(cD2);

        Collections.sort(cuentasDebito, new CuentaCorrienteDebitoSaldoComparator());
        System.out.println(cuentasDebito);
        

    }

}
