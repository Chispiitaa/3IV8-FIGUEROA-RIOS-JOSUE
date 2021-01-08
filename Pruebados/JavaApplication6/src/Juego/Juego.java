
package Juego;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Josue
 */
public class Juego {
    
    ArrayList <Carta> mprincipal = new ArrayList();
    ArrayList <Carta> mtem = new ArrayList();
    ArrayList <Carta> mjec = new ArrayList();
    ArrayList <Carta> jugador1 = new ArrayList();
    ArrayList <Carta> jugador2 = new ArrayList();
    int contJ1 = 0;
    int contJ2 = 0;
    int turno = 1;
    
    public Juego(){
        Random r = new Random();
        
        for (int a = 0; a < 4; a++) {
            for (int j = 0; j <= 9; j++) {
                Carta ct;
                ImageIcon i;
                switch (a) {
                    case 0:
                        i = new ImageIcon("ImagenesUno/Rojo");
                        ct = new Carta('R',j,i);
                        mtem.add(ct);
                        if(j !=0)mtem.add(ct);
                        break;
                    case 1:
                        i = new ImageIcon("ImagenesUno/Azul");
                        ct = new Carta('A',j,i);
                        mtem.add(ct);
                        if(j !=0)mtem.add(ct);
                        break;
                    case 2:
                        i = new ImageIcon("ImagenesUnos/Amarillo");
                        ct = new Carta('Y',j,i);
                        mtem.add(ct);
                        if(j !=0)mtem.add(ct);
                        break;
                    case 3:
                        i = new ImageIcon("ImagenesUnos/Verde");
                        ct = new Carta('V',j,i);
                        mtem.add(ct);
                        if(j !=0)mtem.add(ct);
                        break;
                    
                        
                }
                
            }
        }
        for (int a = 0; a < 4; a++) {
            Carta ct;
            char tc = 'R';
            String carp = "";
            switch (a) {
                case 0:
                    tc = 'R';
                    carp = "/Rojo/";
                    
                break;
            case 1:
                    tc = 'A';
                    carp = "/Azul/";
                    
                break;
            case 2:
                    tc = 'A';
                    carp = "/Amarillo/";
                    
                break;
            case 3:
                    tc = 'V';
                    carp = "/Verde/";
                    
                break;
                
            }
            ct = new CartaEspecial(tc, new ImageIcon("ImagenesUno"+carp+"z.png"),CartaEspecial.TOMAR2);
            mtem.add(ct);
            mtem.add(ct);
            ct = new CartaEspecial(tc, new ImageIcon("ImagenesUno"+carp+"reversa.png"),CartaEspecial.REVERSA);
            mtem.add(ct);
            mtem.add(ct);
            ct = new CartaEspecial(tc, new ImageIcon("ImagnesUno"+carp+"turno.png"),CartaEspecial.SALTA);
            mtem.add(ct);
            mtem.add(ct);
        }
        
       Carta ct;
       ct = new CartaEspecial('E', new ImageIcon("ImagenesUno/cambiodecolores.png"),CartaEspecial.COMODINCOLOR);
            mtem.add(ct);
            mtem.add(ct);
            mtem.add(ct);
            mtem.add(ct);
        ct = new CartaEspecial('E', new ImageIcon("ImagenesUno/+4.png"),CartaEspecial.COMODINTOMA4);
            mtem.add(ct);
            mtem.add(ct);
            mtem.add(ct);
            mtem.add(ct);
        
        int x;
        while(mtem.size()>0){
            x = r.nextInt(mtem.size());
            mprincipal.add(mtem.get(x));
            mtem.remove(x);
        }
        
        for (int a = 0; a < 7; a++) {
            Carta tem = mprincipal.get(a);
            jugador1.add(tem);
            if(a==0)
                this.mprincipal.get(0).imprimirCarta();
                mprincipal.remove(a);
        }
        for (int a = 0; a < 7; a++) {
            Carta tem = mprincipal.get(a);
            jugador2.add(tem);
            if(a==0)
                this.mprincipal.get(0).imprimirCarta();
            mprincipal.remove(0);
        }
    }
    
    
    
}
