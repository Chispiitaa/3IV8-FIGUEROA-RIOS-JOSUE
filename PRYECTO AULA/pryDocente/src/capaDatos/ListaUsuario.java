
package capaDatos;


import capaLogica.Usuario;
import java.util.ArrayList;




public class ListaUsuario {

    public ArrayList<Usuario> listapersona = new ArrayList<Usuario>();

   public void agregar(Usuario p){
       listapersona.add(p);
   }
   
   public ArrayList<Usuario> mostrar(){
   
       return listapersona;
   }
    

}
