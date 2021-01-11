
package Lookand;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class ControlarPersona {
    
    private  ArrayList<Usuario> datos = new ArrayList();
    
    public  void agregar(Usuario persona){
        datos.add(persona);
    }
    
    public int buscar(String nombre){
        int posBuscando = 0;
        String nombreBusca;
        
        
        
        nombreBusca = nombre;
        
        //puedo ocupar mi metodo para buscarlo a partir de la posicion
        posBuscando = traePosicion(nombreBusca);
        
        //mando imprimir
        
        System.out.println("Nombre: " + datos.get(posBuscando).getNombre());
        
        
        return posBuscando;
    }

    
    public int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista del array
        for(int i = 0; i < datos.size(); i++){
            if(nombreBuscar.equals(datos.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
                JOptionPane.showMessageDialog(null, "USUARIO NO ENCONTRADO");
            }
        }
        if(!existe){
            System.out.println("NO HAY REGISTRO DE USUARIO");
            pos = -1;
        }
        return pos;
    }

    
    public  void eliminar(Usuario eliminar){
        datos.remove(eliminar);
        JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CON ÉXITO.");
    }
    
    public  void modificar(Usuario actualizado){
        int actualizar = buscar(actualizado.getNombre());
        datos.remove(actualizar);
        datos.add(actualizado);
        JOptionPane.showMessageDialog(null, "SE HA ACTUALIZADO CON ÉXITO");
    }
    
    public  ArrayList<Usuario> mostrar(){
        return datos;
    }
    
    
}
