package ove;

import JUEGO.interfaz;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Ove implements Serializable{
    public static void main() {
        procesos objlista = new procesos();
        int opcion;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija el proceso a realizar:\n"+ "1.-agregar un usuario\n"+ "2.-consultar todos los usuarios\n"+ "3.-modificar un usuario;\n"+ "4.- salir ."));
           
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"YA NO SE PUEDEN MÁS REGISTROS");
                break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"En la casita, brother");
                break;
                
                case 3:
                    objlista.modificar();
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Archivo generado.");
                    objlista.grabar();
                break;
                
                default:
                JOptionPane.showMessageDialog(null,"Error.");
            }       
        }while((opcion >= 1) && (opcion < 4));
    }
}