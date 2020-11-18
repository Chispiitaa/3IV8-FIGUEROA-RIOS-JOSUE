//libreria
import java.util.Scanner;
class Principal{

    //metodo principal
    public static void main(String[] args) {
        char repetir;

        //Objeto de la clase menu
        Menu menus = new Menu();

        //objeto del metodo Scanner
        Scanner leer = new Scanner(System.in);
        do{
            //mandamos a llamar al metodo indice
            menus.indice();

            System.out.println("Si desea repetir los programas digite 'r', de lo contraio digite 's'.");
            repetir = leer.next().charAt(0);
        }while(repetir != 's');
    }
}