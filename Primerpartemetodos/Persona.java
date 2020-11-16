import java.util.Scanner;
public class Persona{
    //Objeto del metodo Scanner
    Scanner lee = new Scanner(System.in);
    //Atributos
    private int ano;
    private int mes;
    private int ano2;
    private int mes2;
    private int resultado;
    private int resultado2;
    

    //metodos
    public void llamarEdad() {
        edadPersona();
        calEdad();
        mostrarEdad();
    }
    public void edadPersona(){
        System.out.println("Inserte el año de nacimiento.");
        ano = lee.nextInt();

        //Corregimos, cualquier error
        while(ano<=0){
            System.out.println("Ingrese un año positivo. Gracias.");
            ano = lee.nextInt();
        }
        System.out.println("Inserte el mes de nacimiento. (En numeros).");
        mes = lee.nextInt();
        //Corregimos, cualquier error
        while(mes>12 || mes<0){
            System.out.println("Ingrese un valor aceptado. Gracias.");
            mes = lee.nextInt();
        }
        //Se toma el actual, el 2020
        System.out.println("Inserte el año en que se encuentra.");
        ano2 = lee.nextInt();
        //Corregimos, cualquier error
        while(ano2<=0 || ano2<ano){
            System.out.println("Ingrese un valor aceptado. Gracias.");
            ano2 = lee.nextInt();
        }
        System.out.println("Inserte el mes en el que se encuentra. (En numeros).");
        mes2 = lee.nextInt();
        //Corregimos, cualquier error
        while(mes2>12 || mes2<0){
            System.out.println("Ingrese un valor aceptado. Gracias.");
            mes2 = lee.nextInt();
        }
        
    }

    //metodo para calcular su edad
    public void calEdad() {
        resultado = ano2-ano;
        resultado2 = mes2-mes;
        if(resultado2<0){
            resultado = resultado-1;
            resultado2 = resultado2+12;
            resultado2 *= 1;
        }        
    }

    //metodo para imprimir su edad
    public void mostrarEdad() {
        System.out.println("Su edad es de: "+resultado+" años y "+resultado2+" meses.");
    }
}