/**
 *
 * @author Josue Figueroa
 */

//libreria
import javax.swing.JOptionPane;
//clase principal
public class Principal{
//Metodo principal
    public static void main(String[] args) {
        //Atributos
         int volver;

        //Objeto del menu
        Menu menu = new Menu();
       
        do{
        menu.indice();
        volver = Integer.parseInt(JOptionPane.showInputDialog(null, "Si desea repetit el programa: \n1. Si.\n2. No."));
        }while(volver == 1);
    }


}

