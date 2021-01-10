
package Lookand;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class ControlarPersona {
    
    private static ArrayList<Usuario> datos = new ArrayList();
    
    public static void agregar(Usuario persona){
        datos.add(persona);
    }
    
    public static Usuario buscar(String usuario){
    
        Usuario buscando = new Usuario() {};
        
        for(Usuario elemento: datos){

            if(usuario != elemento.getNombre()){
                JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA REGISTRO DEL USUARIO.");
            }else{
                buscando = elemento;
            }

        }
            return buscando;
        
    }
    
    public static void eliminar(Usuario eliminar){
        datos.remove(eliminar);
        JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CON ÉXITO.");
    }
    
    public static void modificar(Usuario actualizado){
        Usuario actualizar = buscar(actualizado.getNombre());
        datos.remove(actualizar);
        datos.add(actualizado);
        JOptionPane.showMessageDialog(null, "SE HA ACTUALIZADO CON ÉXITO");
    }
    
    public static ArrayList<Usuario> mostrar(){
        return datos;
    }
    
    
}
