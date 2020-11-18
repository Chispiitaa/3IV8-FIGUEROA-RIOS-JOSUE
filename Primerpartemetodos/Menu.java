import java.util.Scanner;
public class Menu{
    //Objeto del metodo Scanner
    Scanner entrada = new Scanner(System.in);

    //Atributos
    private int opc;
    private char repe;

    //Indice de los programas
    public void indice(){
        System.out.println("\n3IV8_FIGUEROA_RIOS_JOSUE.");
        System.out.println("\nElija la opcion deseada: ");
        System.out.println("\n1.- Edad de la persona.");
        System.out.println("2.- Area y perimetro de un circulo o un rectangulo o un cuadrado o un triangulo.");
        System.out.println("3.- Llamadas telefonicas.");
        System.out.println("4.- Salir.");
        opc = entrada.nextInt();

        //Creamos dos bucles por si ingresa valores incorrectos
        while(opc>4){
            System.out.println("Ha ingresado un numero incorrecto. Elija la opcion deseada: ");
            opc = entrada.nextInt();
        }
        while(opc<0){
            System.out.println("Ha ingresado un numero incorrecto. Elija la opcion deseada: ");
            opc = entrada.nextInt();
        }

        /*Creamos objetos de laa clases: 
        -Persona
        -Figuras
        -Compania 
        */
        Persona personita = new Persona();
        Figuras figuritas = new Figuras();
        Compania pequenita = new Compania();

        //Creamos el switch del indice
        switch (opc) {
            case 1:
                do{ 
                //llamamos a los metodos de la clase Persona
                personita.llamarEdad();
                System.out.println("Si desea repetir el caso, digite 't', de lo contrario, digite 'e'");
                repe = entrada.next()charAt(0);
                }while(repe == 't');
            break;
            case 2:
                do{ 
                //llamamos alos metodos de la clase Figuras
                figuritas.meFiguras();
                System.out.println("Si desea repetir el caso, digite 't', de lo contrario, digite 'e'");
                repe = entrada.next()charAt(0);
                }while(repe == 't');
            break;
            case 3:
                do{ 
                //llamamos a los metodos de la clase Compania
                pequenita.meCompania();
                System.out.println("Si desea repetir el caso, digite 't', de lo contrario, digite 'e'");
                repe = entrada.next()charAt(0);
                }while(repe == 't');
            break;
            default:
            System.out.println("No lo olvides, 'El dolor y el sacrificio llevan a un mejor entendimiento'.");   
        }
        
    }
}