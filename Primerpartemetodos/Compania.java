import java.util.Scanner;
public class Compania{
    //Objeto de la clase Scanner
    Scanner girasol = new Scanner(System.in);

    //Atributos
    private int numero;
    private int credito=100;
    private int opcion2;
    private int desicion;
    
    public void meCompania(){

        //menu del programa
        System.out.println("Felicidades ha recibido $100 pesos de credito.");
        System.out.println("\nElija la opcion deseada: ");
        System.out.println("\n1. Llamadas locales Nacionales.");
        System.out.println("2. Llamadas Internacionales.");
        System.out.println("3. Llamadas a numeros celulares.");
        System.out.println("4. Consultar credito.");
        System.out.println("5. Salir");
        opcion2 = girasol.nextInt();

        //Un bucle por si el usuario tiene un error
        while(opcion2>5 || opcion2<0){
            System.out.println("Ingrese valores correctos. Elija la opcion deseada: ");
            opcion2 = girasol.nextInt();
        }

        //Creamos nuestro switch
        switch (opcion2) {
            case 1:
                //mandamos a llamar al metodo de llamadas locales
                opLocales();
            break;
            case 2:
                //mandamos a llamar al metodo de llamadas internacionales
                opInter();
            break;
            case 3:
                //mandamos a llamar al metodo de llamadas celulares
                opCel();
            break;
            case 4:
                //mandamos a llamar al metodo de consultar credito
                opCredi();
            break;
            default:
            System.out.println("Besitos, besitos. UwU. ");
        }
    }

    //Metodo de las llamadas locales
    public void opLocales(){
        System.out.println("\nLas llamadas Locales Nacionales, tienen un costo de $0.5.");
        System.out.println("\nIngrese el numero a llamar.");
        numero = girasol.nextInt();
        do{
            credito -= 0.5;
            System.out.println("Si desea dejar de gastar digite 0, de lo contrario digite 1.");
            desicion = girasol.nextInt();
        }while(desicion == 1);
        opCredi();
    }

    //Metodo de las llamadas internacionales
    public void opInter(){
        System.out.println("Las llamadas Internacionales, tiene un costo de $0.6. ");
        System.out.println("\nIngrese el numero a llamar.");
        numero = girasol.nextInt();
        do{
            credito -= 0.6;
            System.out.println("Si desea dejar de gastar digite 0, de lo contrario digite 1.");
            desicion = girasol.nextInt();
        }while(desicion == 1);
        opCredi();
    }

    //Metodo de las llamadas a celular
    public void opCel(){
        System.out.println("Las llamadas a celulares tiene un costo de $0.2.");
        System.out.println("\nIngrese el numero a llamar.");
        numero = girasol.nextInt();
        do{
            credito -= 0.2;
            System.out.println("Si desea dejar de gastar digite 0, de lo contrario digite 1.");
            desicion = girasol.nextInt();
        }while(desicion == 1);
        opCredi();
    }

    //Metodo para consultar el saldo
    public void opCredi(){
        System.out.println("Su credito es de: "+credito);
    }
    
}