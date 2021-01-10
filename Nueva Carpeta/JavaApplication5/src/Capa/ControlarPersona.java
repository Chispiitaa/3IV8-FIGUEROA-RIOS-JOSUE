
package Capa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class ControlarPersona {
    
    private ArrayList<Usuario> datos = new ArrayList();
    
    public void agregar(Usuario persona){
        datos.add(persona);
    }
    
    public Usuario buscar(String usuario){
    
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
    
    public void eliminar(Usuario eliminar){
        datos.remove(eliminar);
        JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CON ÉXITO.");
    }
    
    public void modificar(Usuario actualizado){
        Usuario actualizar = buscar(actualizado.getNombre());
        datos.remove(actualizar);
        datos.add(actualizado);
        JOptionPane.showMessageDialog(null, "SE HA ACTUALIZADO CON ÉXITO");
    }
    
    
}
