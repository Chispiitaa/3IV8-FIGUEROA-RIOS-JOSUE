
package Lookand;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
    public class ControlarPersona {
    
    /**
     *
     */
    public  ArrayList<Usuario> datos;
    

   
    
    public  void agregar(Usuario persona){
        datos.add(persona);
    }
    
    public Usuario buscarPersona(String nombre){
        //necesito un objeto de persona
        Usuario encontrada = new Usuario();
        //recorrer todos los registros hasta que el id = al que buscando
        for(Usuario p : datos){
            //de persona vas a buscar hasta que en listapersona encuentras id
            if(nombre == p.getNombre()){
                encontrada = p;
            }else{
                JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO REGISTRO DE ESTE USUARIO.");
            }
        }
        return encontrada;
    }

    
    public  void eliminar(Usuario eliminar){
        datos.remove(eliminar);
        JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CON ÉXITO.");
    }
    
    
    
    public  ArrayList<Usuario> mostrar(){
        return datos;
    }
    
    
}
