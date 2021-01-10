/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lookand;

/**
 *
 * @author Josue
 */
import java.io.Serializable;
import java.util.ArrayList;

//molde
public  class Usuario implements Serializable {
    
    private String nombre;
    private String password;
    
    public Usuario(){
    
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static int veificarUsuario(){
        ArrayList lista = mostrar();
        return 0;
    }
    
    public static int verificarUsuario(String usuario){
        ArrayList lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario)lista.toArray();
        }
    }
    
    /**
     *
     * @return
     */
    public static ArrayList mostrar(){
        return ControlarPersona.mostrar();
    }
}
