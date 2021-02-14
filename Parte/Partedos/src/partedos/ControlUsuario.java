
package partedos;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class ControlUsuario {
    private ArrayList<Usuario> user = new ArrayList();
    
    public ControlUsuario(){
    }
    
    public ArrayList getArrUsuario(){
        user = new ArrayList<Usuario>();
        return user;
    }
}
