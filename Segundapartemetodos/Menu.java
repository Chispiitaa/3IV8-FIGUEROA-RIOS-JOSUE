//Librerias
import javax.swing.JOptionPane;
//Clase del menu
public class Menu{
     //Atributos
     private int opc;
     private char repe;
 
     //Indice de los programas
     public void indice(){
         JOptionPane.showMessageDialog(null, "3IV8_FIGUEROA_RIOS_JOSUE.");
         JOptionPane.showMessageDialog(null, "Elija la opcion deseada: ");
         String opcion = JOptionPane.showInputDialog(null, "1.- Edad de la persona. \n2.- Area y perimetro de un circulo o un rectangulo o un cuadrado o un triangulo. \n3.- Llamadas telefonicas.", "4.- Salir.");
         int opc = Integer.parseInt(opcion);
 
         //Creamos dos bucles por si ingresa valores incorrectos
         while(opc>4){
             System.out.println("Ha ingresado un numero incorrecto. Elija la opcion deseada: ");
             
         }
         while(opc<0){
             System.out.println("Ha ingresado un numero incorrecto. Elija la opcion deseada: ");
             
         }
    }
}