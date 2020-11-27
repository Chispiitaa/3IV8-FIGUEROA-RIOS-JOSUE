/*
FIGUEROA RIOS JOSUE
*/


import java.util.Scanner;
public class Main{
    //metodo principal
    public static void main(String[] args) {
        //creamos a nuestro objeto del metodo scanner
        Scanner leer = new Scanner(System.in);
        int repetir;

        //realizamos un bucle, si desea repetir el programa
        do{ 
        //mandamos a llamar al objeto de la clase.
        Juego play = new Juego();
        play.ahorcado();
        System.out.println("\nSi desea repetir el juego, Elija la opcion, deseada:\n1. Si.\n2. No.");
        repetir = leer.nextInt();
        }while(repetir == 1);

    
    }
}