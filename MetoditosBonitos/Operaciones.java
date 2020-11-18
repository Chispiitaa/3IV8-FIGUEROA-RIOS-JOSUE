/*
Esta clase es la que va a tener una relacion con la clase principal, 
en esta se va a encargar de realizar los metodos necesarios para 
resolver lo siguiente
una calculadora
conversion de unidades
creacion de cuadros
movimiento de cuadro
*/
//Importamos  una parte de la libreria util
import java.util.Scanner;

public class Operaciones{

    //crear un objeto para manipular datos
    Scanner entrada = new Scanner(System.in);

    //vamos a crear un metodo menu
    public void menu(){

        char op;
        System.out.println("Elija la opcion deseada: ");
        System.out.println("\nA.- Calculadora");
        System.out.println("B.- Conversor de unidades");
        System.out.println("C.- Creacion de cuadros");
        System.out.println("D.- Movieminto en cuadro");
        op = entrada.next().charAt(0);

        
        
        //vamos a crear un switch
        switch(op){

            case 'A':
                //vamos a crear el metodo de calculadora
                Calculadora();
                break;

            case 'B':
                //vamos a crear el metodo de Converso de unidades
                ConversorUnidades();
                break;  

            case 'C':
                //vamos a crear el metodo de creacion de cuadros
                CreaCuadro();
                break;
            case 'D':
                //vamos a crear el metodo de moviemiento de cuadros
                MoviCuadro();
                break;
            default:
            System.out.println("Fue un placer y honor 'solado'.");
        }
    }

    //metodo para la calculadora
    public void Calculadora(){

        //variables que voy a ocupar
        double numero = 0.00, suma = 0.00, multi = 1.00, dividi=1;
        char operacion, p;

        System.out.println("Seleccione la opcion deseada: ");
        System.out.println("a. Suma.");
        System.out.println("b. Resta.");
        System.out.println("c. Multiplicacion.");
        System.out.println("d. Division.");

        operacion = entrada.next().charAt(0);

        //creamos un switch
        switch(operacion){

            case 'a':
                do{

                    System.out.println("Para dejar de sumar ingresa 0");
                    System.out.println("Ingresa el valor a sumar: ");
                    numero = entrada.nextDouble();

                    suma += numero;
                    //suma = suma + numero;
                }while(numero!=0);
                System.out.println("La suma total es de: "+ suma);
            break;
            case 'b':
                do{
                    System.out.println("Para dejar de restar ingresa 0");
                    System.out.println("Ingresa el valor a restar: ");
                    numero = entrada.nextDouble();

                    suma = numero-suma;
                    
                }while(numero!=0);
                System.out.println("La suma total es de: "+suma);
            break;
            case 'c':
                do{

                    System.out.println("Para dejar de multiplicar ingresa 0");
                    System.out.println("Ingresa el valor a multiplicar: ");
                    numero = entrada.nextDouble();

                    if(numero > 0){
                    multi *= numero;
                    //multi = multi*numero
                    }else{
                    System.out.println("Hola, cordialmente te saludo, te pido de la manera mas atenta, que solo ingreses valores positivos. Besitos.");
                    }


                }while(numero!=0);
                    System.out.println("La multiplicacion total es de: "+ multi);
                    //ahi lo hacen soy flojito *w*
            break;
            case 'd':
            do{
                System.out.println("Digite el numero. Si desea parar digite '1'.");
                numero = entrada.nextInt();
                
                while(numero<=0){
                    System.out.println("Hola, cordialmente te saludo, te pido de la manera mas atenta, que solo ingreses valores (positivos y que no sea cero). Besitos.");
                    numero = entrada.nextInt();
                }

                dividi = numero / dividi;

            }while(numero != 1);
                    
            System.out.println("El resultado de la division es: "+dividi);
            break;
            
                
        }


    }

    public void ConversorUnidades(){
        //variables que voy a ocupar
        double num1, num2;
        int ops;
        //Creamos un menu
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Convertir de Metros a centimetros: ");
        System.out.println("2.- Convertir de Kilogramos a libras: ");
        System.out.println("3.- Convertir de Kilogramos a onzas: ");
        System.out.println("4.- Convertir de Metros a pulgadas: ");
        ops=entrada.nextInt();
        //condicional por si no se sabe los numeros
        while(ops<=0 || ops>4){
            System.out.println("Le pido de favor, que solo digite numeros entre 1-3. Gracias.");
            ops=entrada.nextInt();
        }
        //Creamos el switch
        switch (ops) {
            case 1:
                System.out.println("Digite los metros a convertir: ");
                num1 = entrada.nextDouble();
                num2 = num1*100;
                System.out.println("El total de centrimetros son: "+num2);
                break;
            case 2:
                System.out.println("Digite los kilogramos a convertir: ");
                num1 = entrada.nextDouble();
                num2 = num1*2.205;
                System.out.println("El total de libras son: "+num2);
                break;
            case 3:
                System.out.println("Digite los kilogramos a convertir: ");
                num1 = entrada.nextDouble();
                num2 = num1*35.274;
                System.out.println("El total de onzas son: "+num2);
                break;
            case 4:
                System.out.println("Digite los metros a convertir: ");
                num1 = entrada.nextDouble();
                num2 = num1*39.3701;
                System.out.println("El total de pulgadas son: "+num2);
                break;
        }
        
    }

    public void CreaCuadro(){

        //Variables que vamos a utilizar
        int n, m = 0;

        //vamos a crear un cuadro magico de *
        do{

            System.out.println("Ingresa el numero de * que tenga el cuadro magico");
            n = entrada.nextInt();

            //vamos a tener un maximo de *
            if((n<0) || (n>1000)){
                System.out.println("No se aceptan negativos, ni valores superiores a 1000");
            }else{
                    //la base 
                for(int i=0; i<=n-1; i++){
                    System.out.print("*");
                }
                //salto de linea \n
                System.out.println("\n");
                    //se encarga de la altura
                    for(int i = 0; i<n-1; i++){

                        System.out.print("*");
                        //este se encarga de los espacios de adentro del cuadrado
                        for(int j = 0; j<n-1; j++){

                            System.out.print(" ");
                        }
                        System.out.println("*");
                        
                        
                    }
                    for(int k = 0; k<=n; k++){

                        System.out.print("*");
                    }
            }
            System.out.println("\n");
        }while(m!=1);
    }

    public void MoviCuadro(){

        //es suyo despues de que yo haga el anterior
    }
}