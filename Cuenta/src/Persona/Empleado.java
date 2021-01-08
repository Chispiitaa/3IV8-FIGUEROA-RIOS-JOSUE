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
public class Empleado extends Persona {
    
    private int num_empleado;
    private double sueldo;
    
    //para genrar la instancia
    public Empleado() {
    }
    
    //contructor con paso de parametros de la herencia
    public Empleado(int num_empleado, double sueldo, String nombre, String appat, String apmat, String domicilio, int edad) {
        super(nombre, appat, apmat, domicilio, edad);
        this.num_empleado = num_empleado;
        this.sueldo = sueldo;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //operaciones
    /*
    si voy a registrar un cliente, ¿que tipo de metodo es?
    -String
    -int
    -double
    -void
    */
    public void registrarCliente(Cliente c){
    /*
    para poder registrar un nuevo cliente, debemos obtener
    el objeto del cliente
    */
    
    }
    
}
