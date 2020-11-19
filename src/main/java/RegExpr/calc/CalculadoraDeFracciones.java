/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExpr.calc;

/**
 *
 * @author lubo1
 */
public class CalculadoraDeFracciones {

    private Fraccion operador1;
    private Fraccion operador2;

    public CalculadoraDeFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    // a/b + c/d = (ad + bc) / bd
    public Fraccion suma() {
        Fraccion fS = new Fraccion(operador1.getNumerador() * operador2.getDenominador() + operador2.getNumerador() * operador1.getDenominador(),
                operador1.getDenominador() * operador2.getDenominador());
        Fraccion fT = simplificacion(fS);
        return fT;
    }

    public Fraccion resta() {
        Fraccion fR = new Fraccion(operador1.getNumerador() * operador2.getDenominador() - operador2.getNumerador() * operador1.getDenominador(),
                operador1.getDenominador() * operador2.getDenominador());
        Fraccion fT = simplificacion(fR);
        return fT;
    }

    public Fraccion producto() {
        Fraccion fP = new Fraccion(operador1.getNumerador() * operador2.getNumerador(), operador1.getDenominador() * operador2.getDenominador());
        Fraccion fT = simplificacion(fP);
        return fT;
    }

    public Fraccion division() {
        Fraccion fD = new Fraccion(operador1.getNumerador() * operador2.getDenominador(), operador1.getDenominador() * operador2.getNumerador());
        Fraccion fT = simplificacion(fD);
        return fT;
    }

    public double mcd(double d1, double d2) {
        double dividendo;
        double divisor;
        double resto;
        if (d1 < 0 || d2 < 0) {
            return 0;
        } else {
            if (d1 > d2) {
                dividendo = d1;
                divisor = d2;

            } else {
                dividendo = d2;
                divisor = d1;

            }
            resto = dividendo % divisor;
            do {
                dividendo = divisor;
                divisor = resto;
                resto = dividendo % divisor;
            } while (resto != 0);

        }
        return divisor;

    }

    public Fraccion simplificacion(Fraccion fraccion) {
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        return new Fraccion(fraccion.getNumerador() / mcd, fraccion.getDenominador() / mcd);
    }

}
