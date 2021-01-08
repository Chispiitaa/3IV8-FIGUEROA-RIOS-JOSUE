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
public class Persona {
    
    //variables
    private String nombre;
    private String appat;//Apellido paterno
    private String apmat;//Apellido materno
    private String domicilio;
    private int edad;
    
    //generar la instancia
    public Persona() {
    }
    
    //contructor
    public Persona(String nombre, String appat, String apmat, String domicilio, int edad) {
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
        this.domicilio = domicilio;
        this.edad = edad;
    }
    
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
