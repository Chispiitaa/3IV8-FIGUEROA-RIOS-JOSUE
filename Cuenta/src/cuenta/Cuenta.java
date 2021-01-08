
package cuenta;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objeto del scanner
        Scanner entrada = new Scanner(System.in);
        
        int opc;
        //apertura de una cuenta
        
        do{
        System.out.println("Bienvenido al banquito Juanito.\n");
        System.out.println("Elija la opcion deseada:\n");
        System.out.println("1. Cuenta de debito.");
        System.out.println("2. Cuenta de credito.");
        System.out.println("3. Cuenta de cheques.");
        System.out.println("4. Salir.");
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                //abrir una cuenta debito
                break;
            case 2:
                //abrir una cuenta de credito
                break;
            case 3:
                //abrir una cuenta de cheques
                break;
            default:
                System.out.println("Hasta luego, vuelva pronto.");
                break;
        }
        }while(opc != 4);
        
    }
    
}
