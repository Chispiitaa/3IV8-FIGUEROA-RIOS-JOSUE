import java.util.Scanner;
public class Figuras{
    //Objeto del metodo Scanner
    Scanner sopita = new Scanner(System.in);

    //Atributos
    private int opcion;
    private double resultado;
    private double base;
    private double lado1;
    private double altura;

    //metodo del menu
    public void meFiguras(){
        //menu de las figuras
        System.out.println("1. Area y perimetro de un triangulo.");
        System.out.println("2. Area y perimetro de un rectangulo.");
        System.out.println("3. Area y perimetro de un circulo.");
        System.out.println("4. Area y perimetro de un cuadrado.");
        System.out.println("5. Salir.");
        opcion = sopita.nextInt();

        //Creamos bucles por si el usuario tiene un error
        while(opcion<0 || opcion>5){
            System.out.println("Ingrese un valor aceptado. Elija la opcion deseada: ");
            opcion = sopita.nextInt();
        }

        //switch del menu
        switch (opcion) {
            case 1:
                //mandamos a llamar al metodo del triangulo
                opeTriangulo();
            break;
            case 2:
                //mandamos a llamar al metodo del rectangulo
                opeRectangulo();
            break;
            case 3:
                //mandamos a llamar al metodo del circulo
                opeCirculo();
            break;
            case 4:
                //mandamos a llamar al metodo del cuadrado
                opeCuadrado();
            break;
            default:
            System.out.println("Besitos, besitos.");
        }
    }

    //metodo del triangulo, sus operaciones y resultados
    public void opeTriangulo(){
        System.out.println("Ingresa el valor de la base");
        base = sopita.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        altura = sopita.nextDouble();
        resultado=(altura*2)+(base*2);
        System.out.println("El perimetro es: "+resultado);
        resultado = (base*altura)/2;
        System.out.println("El area del triangulo es de: "+resultado);
    }

    //metodo del rectangulo, sus operaciones y resultados
    public void opeRectangulo(){
        System.out.println("Inserta el valor de la base");
        base = sopita.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        lado1 = sopita.nextDouble();
        resultado=base*lado1;
        System.out.println("El area del rectangulo es de: "+resultado);
        resultado=(lado1*2)+(base*2);
        System.out.println("El perimetro del rectangulo es: "+resultado);
    }

    //metodo del circulo, sus operaciones y resultados
    public void opeCirculo(){
        System.out.println("Ingresa el valor de la radio");
        base = sopita.nextDouble();
        resultado=base*2;
        System.out.println("El valor de la circunferencia es de: "+resultado);
        resultado = 3.1416*base*base;
        System.out.println("El area del circulo es de: "+resultado);
    }

    //metodo del cuadrado, sus operaciones y resultados
    public void opeCuadrado(){
        System.out.println("Ingresa el valor del lado");
        base = sopita.nextDouble();
        resultado=base*4;
        System.out.println("El perimetro del cuadrado es de: "+resultado);
        resultado = base*base;
        System.out.println("El area  del cuadrado es de: "+resultado);
    }
}