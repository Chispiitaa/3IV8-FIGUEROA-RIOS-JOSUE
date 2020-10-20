/*
Como hemos visto en sesiones anteriores es posible captar la entrada
de datos a partir de readline(), que es un metodo de la consola o la entrada


*/
//libreria
import java.util.Scanner; //solo lo que se ocupa
import java.util.*; //Mandando a llamar a toda la libreria

class EntradaDatosUsuario{
    //metodo principal
public static void main(String[] args){
//a nuetro a objeto o vamos a crear una instancia
//invocación del objeto.
//el nombre de la clase-objeto
Scanner entrada=new Scanner(System.in);
//variables
String nombre;
int edad; 
float altura;

System.out.println("Escribe tu nombre");
nombre=entrada.nextLine();
System.out.println("Escribe tu edad");
edad=entrada.nextInt();
System.out.println("Escribe tu estatura");
altura=entrada.nextFloat();

System.out.println("Tu nombre es: "+nombre);
System.out.println("Tu edad es: "+edad);
System.out.println("Tu altura es: "+altura);

}


}