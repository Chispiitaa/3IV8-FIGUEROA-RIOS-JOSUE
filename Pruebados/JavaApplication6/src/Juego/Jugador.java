
package Juego;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class Jugador {
    ArrayList <Carta> cartita;
    String nombre;
    static int njugador;
    
    public Jugador(String n, int np){
        nombre = n;
        njugador = np;
        cartita = new ArrayList(7);
        
    }

    public ArrayList<Carta> getCartita() {
        return cartita;
    }

    public void setCartita(ArrayList<Carta> cartita) {
        this.cartita = cartita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNjugador() {
        return njugador;
    }

    public static void setNjugador(int njugador) {
        Jugador.njugador = njugador;
    }
    
    
    
}
