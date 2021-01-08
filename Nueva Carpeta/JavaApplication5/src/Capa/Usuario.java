/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa;

import java.util.Vector;
import java.io.Serializable;
/**
 *
 * @author Josue
 */

public class Usuario implements Serializable {
    private String username;
    private String contraseña;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
        
    }

    public static int verificarUsuario(String usuario){
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario)lista.elementAt(i);
            if(obj.getUsername().equalsIgnoreCase(usuario)){
                return i;
            }
        }
        return -1;
    }
    
    public static int verificarLogueo(String usuario, String contraseña){
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario)lista.elementAt(i);
            if(obj.getUsername().equalsIgnoreCase(usuario) && obj.getContraseña().equalsIgnoreCase(contraseña)){
                return i;
            }
        }
        return -1;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public static Vector mostrar(){
        return Listausuario.mostrar();
    }
    
    
}
