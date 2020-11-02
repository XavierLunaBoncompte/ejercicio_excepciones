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
public class Usuario {

    private String nombre;
    private int psw;
    private int confirmaPsw;

    public Usuario(String nombre, int psw, int confirmaPsw) throws UsuarioNoRegistradoException {
        if (nombre.isEmpty()) {
            throw new NombreUsuarioVacioException("La variable nombre no puede ser vacia");
        }
        this.nombre = nombre;
        
        if (psw == 0) {
            throw new PasswordUsuarioVacioException("La variable password no puede ser 0");
        }
        this.psw = psw;
        
        if(psw != confirmaPsw) {
            throw new LasPasswordsNoCoincidenException("Las passwords no coinciden");
        }
        this.confirmaPsw = confirmaPsw;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPsw() {
        return psw;
    }

    public void setPsw(int psw) {
        this.psw = psw;
    }

    public int getConfirmaPsw() {
        return confirmaPsw;
    }

    public void setConfirmaPsw(int confirmaPsw) {
        this.confirmaPsw = confirmaPsw;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", psw=" + psw + ", confirmaPsw=" + confirmaPsw + '}';
    }

}
