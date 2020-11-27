/*
En esta parte realizaremos el juego, teniendo en cuenta las intrucciones dadas
*/
import java.util.Scanner;

public class Juego{

    private String palabra;

    //El metodo del ahorcado
    public void ahorcado(){
        //Creamos el objeto 
        Scanner entrada = new Scanner(System.in);

        //Creando variables
        int num_intentos=5, asignacion=0;
        boolean verdad=true, w=true;
        int rep=0;
        
        
        //Vamos a introducir la palabra secreta
        System.out.println("\nIngrese la palabra, para adivinar, crack.");
        palabra = entrada.nextLine();
        System.out.println("\n");
        String letra[] = new String[5];
       
        //Separamos la cadena son "split"
        String [] letras = palabra.split("");
        String intento [] = new String[letras.length];
        String ingresadas [] = new String[letras.length];

        //Aqui, le asignamos a una variable los espacios de la letra
        asignacion=letras.length;
        for(int i=0;i<letras.length;i++){
         intento[i]="* ";
        }

        //Aqui le pedimos al usuario que ingrese la letra
        while(num_intentos>0){   
        System.out.println("Digite 'UNA' letra, gracias.");
        for(int i=0;i<letras.length;i++){    
        System.out.print(intento[i]);
        }  
        System.out.println("");
        letra[0]=entrada.nextLine();
        rep=0;
        boolean aviso=true;
        for(int i=0;i<letras.length;i++){
        w=true;

         //Si el usuario ingresa una letra de las que se encuentran en la palabra secreta.    
        if(letras[i].equals(letra[0])){  
            if(!intento[i].equals(letra[0])){
                intento[i]=letra[0];
                verdad=false;
                rep++; 
                ingresadas[i]=letras[0];  
                }else{
                aviso=false;
                verdad=false;
                }
            }
        }

        //Si el usuario ya ingreso una letra y la repite, dar un aviso
        if(aviso==false){
        System.out.println("Mi pana, usted, ya ingreso esta letra. Intente de nuevo.");
        }
        aviso=true;        
        if(verdad==true){ 
        num_intentos--;
        }else{
        asignacion -= rep;
        }
        System.out.println(" \nColega, las tortillas son : "+num_intentos);

             //llamamos a impresion, para que me imprima y evalue las condiciones
             Operaciones ope = new Operaciones();
             ope.mostrarResultado(num_intentos);
            if(num_intentos==0){
            System.out.println("\nYa no tienes mas tortillas, ni modo brocoli.\nLa palabra era: "+palabra);
            }
            if(asignacion<=0){
            System.out.println("\nMi pana, el trinunfo es la primera etapa de una vida con drogas.");
            num_intentos=0;
            }
             
        }
        
    }

   //Hecho por josue figueroa     
}