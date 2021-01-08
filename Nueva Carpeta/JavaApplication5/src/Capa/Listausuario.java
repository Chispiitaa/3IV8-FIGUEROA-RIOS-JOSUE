
package Capa;

import java.util.Vector;

/**
 *
 * @author Josue
 */
public class Listausuario {
    private static Vector<Usuario> datos = new Vector<Usuario>();
    
    public static void agregar(Usuario obj){
        datos.addElement(obj);
    }
    
    public static void eliminar(int pos){
        datos.removeElementAt(pos);  
    }
    
    public static Vector mostrar(){
        return datos;
    }
    
}
