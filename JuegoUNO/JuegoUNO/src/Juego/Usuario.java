
package Juego;

import java.util.Vector;
import java.io.Serializable;
/**
 *
 * @author Josue
 */

public class Usuario implements Serializable {
    private String username;
    private int ID;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
        
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
    
    public static int verificarLogueo(String usuario, int ID){
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario)lista.elementAt(i);
            if(obj.getUsername().equalsIgnoreCase(usuario) && i==obj.getID()){
                return i;
            }
        }
        return -1;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public static Vector mostrar(){
        return Listausuario.mostrar();
    }
    
    
}
