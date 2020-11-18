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
                            do{      
                            System.out.println("Ingrese el abono.");
                            abono=leer.nextDouble();
                            }while(abono<0);
                            do{ 
                            System.out.println("Ingrese su edad.");
                            edad=leer.nextInt();
                            }while(edad<0); 
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
                            System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                            volver=leer.next().charAt(0);
                        }while(volver == 'a');

                    break;

                    case 2:
                    do
                    {
                        do{ 
                        System.out.println("Ingrese un numero en el sistema decimal.");
                        edad=leer.nextInt();
                        }while(edad<0);
                        String binario = "";
                        if (edad > 0) {
                            while (edad > 0) {
                                if (edad % 2 == 0) {
                                    binario = "0"+binario;
                                } else {
                                    binario = "1"+binario;
                                }
                                edad =edad / 2;
                            }
                        } else if (edad == 0) {
                            binario = "0";
                        } else {
                            binario = "No se pudo convertir el numero.";
                        }
                        System.out.println("El numero convertido a binario es: " +binario);
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
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
                       System.out.println("7.- Convertir de grados °C a °R.");
                       System.out.println("8.- Convertir de grados °R a °C.");
                       System.out.println("9.- Convertir de grados °F a °R.");
                       System.out.println("10.- Convertir de grados °R a °F.");
                       System.out.println("11.- Convertir de grados °K a °R.");
                       System.out.println("12.- Convertir de grados °R a °K.");
                       opcion1=leer.nextInt();
                        switch(opcion1)
                        {
                            case 1:
                                do{
                                System.out.println("Ingrese los grados °C.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=(temp1*1.8)+32;
                                System.out.println("Los grados Fahrenheit: "+resultado);
                            break;

                            case 2:
                                do{
                                System.out.println("Ingrese los grados °F.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=(temp1-32)*(0.5555);
                                System.out.println("Los grados Centigrados: "+resultado);
                            break;

                            case 3:
                                do{
                                System.out.println("Ingrese los grados °C.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=temp1+273.15;
                                System.out.println("Los grados Kelvin: "+resultado);
                            break;

                            case 4:
                                do{
                                System.out.println("Ingrese los grados °K.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=temp1-273.15;
                                System.out.println("Los grados Centigrados: "+resultado);
                            break;

                            case 5:
                                do{
                                System.out.println("Ingrese los grados °F.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=(temp1-32)*(0.5555)+273.15;
                                System.out.println("Los grados Kelvin: "+resultado);
                            break;

                            case 6:
                                do{
                                System.out.println("Ingrese los grados °K.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=(temp1-273.15)*(1.8)+(32);
                                System.out.println("Los grados Fahrenheit: "+resultado);
                            break;
                            
                            case 7:
                                do{
                                System.out.println("Ingrese los grados °C.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=(temp1*1.8)+491.47;
                                System.out.println("Los grados Rankine: "+resultado);
                            break;

                            case 8:
                                do{
                                System.out.println("Ingrese los grados °R.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=(temp1-491.47)*0.5555;
                                System.out.println("Los grados Centrigados: "+resultado);
                            break;

                            case 9:
                                do{
                                System.out.println("Ingrese los grados °F.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=temp1+459.67;
                                System.out.println("Los grados Rankine: "+resultado);
                            break;

                            case 10:
                                do{
                                System.out.println("Ingrese los grados °R.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=temp1-459.67;
                                System.out.println("Los grados Fahrenheit: "+resultado);
                            break;

                            case 11:
                                do{
                                System.out.println("Ingrese los grados °K.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=temp1*1.8;
                                System.out.println("Los grados Rankine: "+resultado);
                            break;

                            case 12:
                                do{ 
                                System.out.println("Ingrese los grados °R.");
                                temp1=leer.nextDouble();
                                }while(temp1<0);
                                resultado=temp1*0.5555;
                                System.out.println("Los grados Kelvin: "+resultado);
                            break;
                        }
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;

                    case 4:
                    do
                    {
                        do{ 
                        System.out.println("Inserte los numeros a leer.");
                        edad=leer.nextInt();
                        }while(edad<0);
                        if(edad>0)
                        {
                            for (int i=1; i<=edad; i++)
                            {
                                do{ 
                                System.out.println("Inserte el numero (Entero).");
                                num=leer.nextInt();
                                }while(num<0);
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
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;

                    case 5:
                    double hedset, monitor, producto, precioteclado=777, preciomouse=560;
                    do
                    {
                        do{ 
                        System.out.println("Ingrese la cantidad de hedset's que lleva.");
                        hedset=leer.nextDouble();
                        }while(hedset<0);
                        do{ 
                        System.out.println("Ingrese la cantidad de monitores que lleva.");
                        monitor=leer.nextDouble();
                        }while(monitor<0);
                        producto=(hedset*precioteclado)+(monitor*preciomouse);
                        System.out.println("El total de los productos adquiridos es de: "+producto);
                        resultado=producto*.16;
                        resultado=producto+resultado;
                        System.out.println("El total de su compra es de: "+resultado);
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
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
                        do{ 
                        System.out.println("Inserte la base del rectangulo.");
                        abono=leer.nextDouble();
                        }while(abono<0);
                        do{ 
                        System.out.println("Inserte la altura del rectangulo.");
                        temp1=leer.nextDouble();
                        }while(temp1<0);
                        resultado=abono*temp1;
                        System.out.println("El area del rectangulo es de: "+resultado);
                        resultado=(abono*2)+(temp1*2);
                        System.out.println("El perimetro del rectagulo es de: "+resultado);
                        break;
                        case 2:
                            do{ 
                            System.out.println("Ingrese la base del triangulo.");
                            abono=leer.nextDouble();
                            }while(abono<0);
                            do{ 
                            System.out.println("Ingrese la altura del triangulo.");
                            temp1=leer.nextDouble();
                            }while(temp1<0);
                            do{ 
                            System.out.println("Ingrese el valor del lado.");
                            temp2=leer.nextDouble();
                            }while(temp2<0);
                            do{ 
                            System.out.println("Ingrese el valor del lado.");
                            temp3=leer.nextDouble();
                            }while(temp3<0);
                            resultado=(abono*temp1)/2;
                            System.out.println("El area del triangulo es de: ."+resultado);
                            resultado=abono+temp2+temp3;
                            System.out.println("El perimetro del triangulo es de: ."+resultado);
                        break;
                        case 3:
                        do{ 
                        System.out.println("Ingrese el valor del radio.");
                        temp1=leer.nextDouble();
                        }while(temp1<0);
                        resultado=(4)*(3.1416)*(temp1*temp1*temp1);
                        resultado=resultado/3;
                        System.out.println("El volumen de la esfera es de: "+resultado);
                        break;
                        case 4:
                        do{ 
                        System.out.println("Ingrese el valor del radio.");
                        abono=leer.nextDouble();
                        }while(abono<0);
                        do{ 
                        System.out.println("Ingrese el valor de la altura.");
                        temp1=leer.nextDouble();
                        }while(temp1<0);
                        resultado=(abono*abono)*(3.1416)*(temp1);
                        System.out.println("El volumen del cilindro es de: "+resultado);
                        break;
                    }
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                    break;
                    case 7:
                    do
                    {
                        for(int i=1; i<=10; i=i+1){

                            System.out.println(i+" "+(i*10)+" "+(i*100)+" "+(i*1000));
                        }
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                        volver=leer.next().charAt(0);  
                    }while(volver=='a');
                    break;   
                    case 8:
                    do
                    {
                        double factorial=1;
                        System.out.println("Inserte el numero.");
                        temp1=leer.nextInt();
                        if(temp1>0)
                        {
                            for(int i=1; i<=temp1; i++)
                            {
                                factorial=factorial*i;
                            }
                            System.out.println("El factorial del numero es: "+factorial);
                        }
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                        volver=leer.next().charAt(0);
                    }while(volver=='a');
                        break;
                    case 9:
                    
                    do
                    {
                        System.out.println("Elija deseada: 1.-Suma, 2.-Resta, 3.-División, 4.-Multiplicaión");
                        opcion1=leer.nextInt();
                        
                        switch(opcion1)
                        {
                            case 1:
                            double resultado1=0;
                            do
                            {
                            System.out.println("Inserte el numero");
                            temp1=leer.nextDouble();
                            resultado1=resultado1+temp1;
                            System.out.println("El resultado de la suma es: "+resultado1);
                            System.out.println("Si desea salir del programa digite '0'.");
                            }while(temp1!=0);
                            System.out.println("El resultado de la suma es: "+resultado1);
                            break;
                            case 2:
                            System.out.println("Inserte el numero.");
                            resultado=leer.nextDouble();
                            do
                            {
                            System.out.println("Inserte el numero");
                            temp1=leer.nextDouble();
                            resultado=resultado-temp1;
                            System.out.println("El resultado de la suma es: "+resultado);
                            System.out.println("Si desea salir del programa digite '0'.");
                            }while(temp1!=0);
                            System.out.println("El resultado de la suma es: "+resultado);
                            break;
                        }   
                        System.out.println("Si desea repetir el caso oprima a, de lo contrario, oprima cualquier tecla.");
                        volver=leer.next().charAt(0);
                        }while(volver=='a');
                            break;

                    default:
                    System.out.println("Gracias, por su atencion. Besitos, besitos, chau, chau. :3");

                }
                    System.out.println("Si desea repetir el programa oprima r.");
                    volver=leer.next().charAt(0);
            }while(volver=='r');

        }

    }