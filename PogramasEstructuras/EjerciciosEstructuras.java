import java.util.Scanner;
    class EjerciciosEstructuras
    {
        public static void main(String[] args)
        {
             
            Scanner leer=new Scanner(System.in);
            int edad, num;
            int cont1=0;
            int cont2=0;
            double resultado, abono, temp1, temp2, temp3;
            int opcion, opcion1;
            char volver, respuesta;
            
           do{ 
                System.out.println("3IV8_FIGUEROA_RIOS_JOSUE");
                System.out.println("");
                System.out.println("Bienvenido, Que quieres hacer");
                System.out.println("1.- Calcular el descuento del abono.");
                System.out.println("2.- Numero de decimal a binario.");
                System.out.println("3.- Convertir temperaturas.");
                System.out.println("4.- Numeros positivos y negativos.");
                System.out.println("5.- Cantidades de productos.");
                System.out.println("6.- Area y perimetro de figuras: -Rectangulo, -Truangulo, -Volumen esfera y cilindro.");
                System.out.println("7.- Tabla de valores.");
                System.out.println("8.- Numero entero (no negativo) y su factorial.");
                System.out.println("9.- Calculadora");
                System.out.println("10.- Salir");
                opcion=leer.nextInt();

                switch (opcion) 
                {
                    case 1:
                        do{      
                            System.out.println("Ingrese el abono.");
                            abono=leer.nextDouble();
                            System.out.println("Ingrese su edad.");
                            edad=leer.nextInt(); 
                            if(edad>=65 && edad<102)
                            {
                                resultado=abono*.40;
                                System.out.println("El descuento de su abono es de: "+resultado);
                            }
                                else if(edad>21 && edad<65)
                                {
                                    System.out.println("No ha recibido descuento del abono: "+abono);
                                }
                                else if (edad<21 && edad>0)
                                {
                                    System.out.println("¿Tus padres son socios?, si es asi oprima 's', de lo contrario oprima 'n' ");
                                    respuesta=leer.next().charAt(0);
                                    if(respuesta =='s')
                                    { 
                                        resultado=abono*.45;
                                        System.out.println("El descuento de su abono es de: "+resultado);
                                    }  
                                    else if(respuesta == 'n')
                                    {
                                        resultado=abono*.25;
                                        System.out.println("El descuento de su abono es de: "+resultado);
                                    }

                            }    
                            System.out.println("Si desea repetir el caso oprima a");
                            volver=leer.next().charAt(0);
                        }while(volver == 'a');

                    break;

                    case 2:
                    do
                    {
                        System.out.println("Ingrese un numero en el sistema decimal.");
                        edad=leer.nextInt();
                        String binario = "";
                        if (edad > 0) {
                            while (edad > 0) {
                                if (edad % 2 == 0) {
                                    binario = "0" + binario;
                                } else {
                                    binario = "1" + binario;
                                }
                                edad =edad / 2;
                            }
                        } else if (edad == 0) {
                            binario = "0";
                        } else {
                            binario = "No se pudo convertir el numero.";
                        }
                        System.out.println("El numero convertido a binario es: " +binario);
                        System.out.println("Si desea repetir el caso oprima a");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;

                    case 3:
                    do
                    {
                       System.out.println("1.- Convertir de grados °C a °F."); 
                       System.out.println("2.- Convertor de grados °F a °C.");
                       System.out.println("3.- Convertir de grados °C a °K."); 
                       System.out.println("4.- Convertir de grados °K a °C."); 
                       System.out.println("5.- Convertir de grados °F a °K."); 
                       System.out.println("6.- Convertir de grados °K a °F."); 
                       opcion1=leer.nextInt();
                        switch(opcion1)
                        {
                            case 1:
                                System.out.println("Ingrese los grados °C.");
                                temp1=leer.nextDouble();
                                resultado=(temp1*1.8)+32;
                                System.out.println("Los grados Fahrenheit: "+resultado);
                            break;

                            case 2:
                                System.out.println("Ingrese los grados °F.");
                                temp1=leer.nextDouble();
                                resultado=(temp1-32)*(0.5555);
                                System.out.println("Los grados Centigrados: "+resultado);
                            break;

                            case 3:
                                System.out.println("Ingrese los grados °C.");
                                temp1=leer.nextDouble();
                                resultado=temp1+273.15;
                                System.out.println("Los grados Kelvin: "+resultado);
                            break;

                            case 4:
                                System.out.println("Ingrese los grados °K.");
                                temp1=leer.nextDouble();
                                resultado=temp1-273.15;
                                System.out.println("Los grados Centigrados: "+resultado);
                            break;

                            case 5:
                                System.out.println("Ingrese los grados °F.");
                                temp1=leer.nextDouble();
                                resultado=(temp1-32)*(0.5555)+273.15;
                                System.out.println("Los grados Kelvin: "+resultado);
                            break;

                            case 6:
                                System.out.println("Ingrese los grados °K.");
                                temp1=leer.nextDouble();
                                resultado=(temp1-273.15)*1.8+(32);
                                System.out.println("Los grados Centigrados: "+resultado);
                            break;
                        }
                        System.out.println("Si desea repetir el caso oprima a");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;

                    case 4:
                    do
                    {
                        System.out.println("Inserte los numeros a leer.");
                        edad=leer.nextInt();
                        if(edad>0)
                        {
                            for (int i=1; i<=edad; i++)
                            {
                                System.out.println("Inserte el numero (Entero).");
                                num=leer.nextInt();
                                if(num>0)
                                {
                                    cont1=cont1+1;
                                }
                                if(num<0)
                                {
                                    cont2=cont2+1;
                                }
                            }
                            System.out.println("Los numeros positivos ingresados fueron: "+cont1 );
                            System.out.println("Los numeros negativos ingresados fueron: "+cont2 );
                        }
                        System.out.println("Si desea repetir el caso oprima a");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;

                    case 5:
                    double teclado, mouse, producto, precioteclado=777, preciomouse=560;
                    do
                    {
                        System.out.println("Ingrese la cantidad de teclados que lleva.");
                        teclado=leer.nextDouble();
                        System.out.println("Ingrese la cantidad de mouse que lleva.");
                        mouse=leer.nextDouble();
                        producto=(teclado*precioteclado)+(mouse*preciomouse);
                        System.out.println("El total de los productos adquiridos es de: "+producto);
                        resultado=producto*.16;
                        resultado=producto+resultado;
                        System.out.println("El total de su compra es de: "+resultado);
                        System.out.println("Si desea repetir el caso oprima a");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;

                    case 6: 
                    do
                    {
                        System.out.println("1.- Calcular el area y perimetro de un rectangulo.");
                        System.out.println("2.- Calcular el area y perimetro de un triangulo.");
                        System.out.println("3.- Calcular el volumen de una esfera.");
                        System.out.println("4.- Calcular el volumen de un cilindro.");
                        opcion1=leer.nextInt();
                        switch(opcion1)
                        { 
                        case 1:
                        System.out.println("Inserte la base del rectangulo.");
                        abono=leer.nextDouble();
                        System.out.println("Inserte la altura del rectangulo.");
                        temp1=leer.nextDouble();
                        resultado=abono*temp1;
                        System.out.println("El area del rectangulo es de: "+resultado);
                        resultado=(abono*2)+(temp1*2);
                        System.out.println("El perimetro del rectagulo es de: "+resultado);
                        break;
                        case 2:
                            System.out.println("Ingrese la base del triangulo.");
                            abono=leer.nextDouble();
                            System.out.println("Ingrese la altura del triangulo.");
                            temp1=leer.nextDouble();
                            System.out.println("Ingrese el valor del lado.");
                            temp2=leer.nextDouble();
                            System.out.println("Ingrese el valor del lado.");
                            temp3=leer.nextDouble();
                            resultado=(abono*temp1)/2;
                            System.out.println("El area del triangulo es de: ."+resultado);
                            resultado=abono+temp2+temp3;
                            System.out.println("El perimetro del triangulo es de: ."+resultado);
                        break;
                        case 3:
                        System.out.println("Ingrese el valor del radio.");
                        temp1=leer.nextDouble();
                        resultado=(4)*(3.1416)*(temp1*temp1*temp1);
                        resultado=resultado/3;
                        System.out.println("El volumen de la esfera es de: "+resultado);
                        break;
                        case 4:
                        System.out.println("Ingrese el valor del radio.");
                        abono=leer.nextDouble();
                        System.out.println("Ingrese el valor de la altura.");
                        temp1=leer.nextDouble();
                        resultado=(abono*abono)*(3.1416)*(temp1);
                        System.out.println("El volumen del cilindro es de: "+resultado);
                        break;
                    }
                        System.out.println("Si desea repetir el caso oprima a.");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    case 7:
                    do
                    {
                        for(int i=1; i<=10; i=i+1){

                            System.out.println(i+" "+(i*10)+" "+(i*100)+" "+(i*1000));
                        }
                        System.out.println("Si desea repetir el caso oprima a.");
                        volver=leer.next().charAt(0);  
                    }while(volver=='a');
                    break;   
                    case 8:
                    do
                    {
                        int factorial=1;
                        System.out.println("Inserte el numero.");
                        edad=leer.nextInt();
                        if(edad>0)
                        {
                            for(int i=1; i<=edad; i++)
                            {
                                factorial=factorial*i;
                            }
                            System.out.println("El factorial del numero es: "+factorial);
                        }
                        System.out.println("Si desea repetir el caso oprima a.");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                        break;
                    case 9:
                    String ingresar;
                    do
                    {
                        System.out.println("Introduzca el primer numero.");
                        temp1=leer.nextDouble();
                        System.out.println("Introduzca el segundo numero.");
                        temp2=leer.nextDouble();
                        System.out.println("Elija deseada: 1.-suma, 2.-multiplicacion, 3.-division, 4.-resta");
                        opcion1=leer.nextInt();
                        switch(opcion1)
                        {
                            case 1:
                            resultado=temp1+temp2;
                            System.out.println("La suma de los numeros es de: "+resultado);
                            break;
                            case 2:
                            resultado=temp1*temp2;
                            System.out.println("La suma de los numeros es de: "+resultado);
                            break;
                            case 3:
                            while(temp2==0)
                            {
                                System.out.println("Introduzca el segundo numero.");
                                temp2=leer.nextDouble();
                            }
                            resultado=temp1/temp2;
                            System.out.println("La suma de los numeros es de: "+resultado);
                            break;
                            case 4:
                            resultado=temp1-temp2;
                            System.out.println("La suma de los numeros es de: "+resultado);
                            break;
                        }
                        System.out.println("Si desea repetir el caso oprima a.");

                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    default:
                    System.out.println("Gracias, por su atencion. Besitos, besitos, chau, chau. :3");

                }
                    System.out.println("Si desea repetir el programa oprima r.");
                    volver=leer.next().charAt(0);
            }while(volver=='r');

        }

    }