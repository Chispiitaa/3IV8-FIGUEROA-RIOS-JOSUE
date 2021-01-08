/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persona;

/**
 *
 * @author Josue
 */
public class Cliente extends Persona {
    
    private int num_cuenta;
    private String tipo_cuenta;
    
    //generar la instancia
    public Cliente() {
    }
    
    //constructor que recibe
    public Cliente(int num_cuenta, String tipo_cuenta, String nombre, String appat, String apmat, String domicilio, int edad) {
        super(nombre, appat, apmat, domicilio, edad);
        this.num_cuenta = num_cuenta;
        this.tipo_cuenta = tipo_cuenta;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }
    
    
    
}
