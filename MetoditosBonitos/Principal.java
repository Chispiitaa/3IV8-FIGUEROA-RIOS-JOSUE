//importaremos parte de la libreria util
import java.util.Scanner;
/*
Esta es la clase principal para poder realizar una instancia
de otra clase que se va a encargar de 
una calculadora
conversion de unidades
creacion de cuadros
movimiento de cuadro
*/ 
public class Principal{

    //el metodo principal
    public static void main(String[] args){
        char letra;
        //Creamos el objeto
        Scanner leer = new Scanner(System.in);
        //ahora vamos a mandar a llamar nuestro metodo de la clase operaciones
        //realizamos la invocacion a partir de la creacion del objeto
        Operaciones obj = new Operaciones();
        do{ 
            obj.menu();
            System.out.println("Si desea repetir el programa digite 'r', de lo contrario digite 's'.");
            letra=leer.next().charAt(0);
        }while(letra=='r');
    }
}