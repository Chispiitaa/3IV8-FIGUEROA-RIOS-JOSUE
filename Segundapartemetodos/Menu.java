//Librerias
import javax.swing.JOptionPane;
//Clase del menu
public class Menu{

    public Menu(){
        //Constructor
    } 
    
    //Atributos
     private int opc;
     private char repe;
     
 
     //Indice de los programas
     public void indice(){
         //Variables
        String opcion;
        int opc;
        JOptionPane.showMessageDialog(null, "Elija la opcion deseada: "); 

        //Generamos un bloque try catch, para el manejo de alguna excepcion
        try {
        opcion = JOptionPane.showInputDialog(null, "1.- Sueldo de empleado. \n2.- Proovedores. \n3.- Libros de una biblioteca.", "4.- Salir.");
        opc = Integer.parseInt(opcion);
        } catch (Exception e) {
        opcion = JOptionPane.showInputDialog(null, "Solo ingresa el numero de la opcion deseada: \n1.- Sueldo de empleado. \n2.- Proovedores. \n3.- Libros de una biblioteca.", "\n4.- Salir. ");
        opc = Integer.parseInt(opcion);
        }

         //Creamos dos bucles por si ingresa valores incorrectos
         while(opc>4){
            opcion = JOptionPane.showInputDialog("Ha ingresado un numero incorrecto. Elija la opcion deseada: \n1.- Sueldo de empleado. \n2.- Proovedores. \n3.- Libros de una biblioteca.", "\n4.- Salir.");
            opc = Integer.parseInt(opcion);
         }
         while(opc<0){
            opcion = JOptionPane.showInputDialog(null, "Ha ingresado un numero incorrecto. Elija la opcion deseada: \n1.- Sueldo de empleado. \n2.- Proovedores. \n3.- Libros de una biblioteca.", "\n4.- Salir. ");
            opc = Integer.parseInt(opcion);
         }

         //El objeto de la clase sueldo
         Sueldo sueldo = new Sueldo();
         Proovedor provenis = new Proovedor();
         Libros libro = new Libros();
         //Cramos el switch del menu
        switch (opc) {
            case 1:
                sueldo.menusito();
            break;
            case 2:
                provenis.llenadoArreglo();
            break;
            case 3:
                libro.Prestar();
            break;
        
            default:
            JOptionPane.showMessageDialog(null, "Hasta luego 'Spartan'.");
        }
    }
}