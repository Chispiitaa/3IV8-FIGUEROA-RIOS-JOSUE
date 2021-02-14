
package capaCliente;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class Controlador {
    ArrayList<Tabla> datosT = new ArrayList();
    
    public void agregar(Tabla agregar){
        datosT.add(agregar);
    }
    
    public void eliminar(Tabla eliminar){
        datosT.remove(eliminar);
    }
    
    public String buscar(Tabla nombreT){
        int indice=0;
        String busqueda=null;
        for(int x=0 ;x< datosT.size();x++){
            if(nombreT.getNombre()==datosT.get(x).getNombre()){
                indice=x;
                datosT.set(indice, nombreT);
            }
           
            
        }
        if(indice==0){
            busqueda="INEXISTENTE";
            
        }
        else{
            busqueda="OK";
        }
        return busqueda;
    
    }
    public void showPersona(){
        for(int x=0;x<datosT.size();x++ ){
            System.out.println(datosT.get(x).getNombre());
            System.out.println(datosT.get(x).getActividad());
            System.out.println(datosT.get(x).getHoras());
            System.out.println(datosT.get(x).getDia());
            
        }
    }
}
