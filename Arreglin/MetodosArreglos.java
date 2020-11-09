import java.util.Scanner;
class MetodosArreglos
{

    Scanner leer3=new Scanner(System.in);
    float num1=0, resultado=0, num2=0, num3=0;
    int cont1=0, cont2=0, cont3=0;
    public void NumeritosUwU()
    {
        float resultado1=0, resultado2=0; 
        float[] num=new float[10];
        for(int i=0; i<num.length; i++)
        {
            System.out.println("Digite el numero.");
            num1=leer3.nextFloat();
            num[i]=num1;
            if(num1>0)
            {
                cont1=cont1+1;
                resultado1=resultado1+num1;
            }
            else if(num1<0)
            {
                cont2=cont2+1;
                resultado2=resultado2+num1;
            }
        }
        resultado1=resultado1/cont1;
        resultado2=resultado2/cont2;
        System.out.println("El promedio de los numeros positivos es: "+resultado1);
        System.out.println("El promedio de los numeros negativos es: "+resultado2);
    }

    public void PromedioUwU()
    {
        int[] prome=new int[10];
        for(int i=0; i<prome.length; i++)
        {
            System.out.println("Digite el numero.");
            prome[i]=leer3.nextInt();
            resultado = prome[0]+prome[2]+prome[4]+prome[6]+prome[8];   
        }
        resultado=resultado/5;
        System.out.println("El promedio es: "+resultado);    
    }

    public void CalificacionesUwU()
    {
        float[] prome=new float[10];
        float[] resultados=new float[10];
       for(int i=0;i<prome.length;i++)
       {
           System.out.println("Inserte la calificacion.");
           prome[i]=leer3.nextInt();
       }
       num1=num2=prome[0];
       for(int i=0;i<prome.length;i++)
       {
           resultado = resultado+prome[i];
           if(prome[i]<=5)
           {
                cont1 += 1;
           }
           else if(prome[i]>=6)
           {
                cont2 += 1;
           }
            
            if(num1<prome[i])
            {
            num1=prome[i];
            }
            if(num2>prome[i])
            {
            num2=prome[i];
            }
       }
       for(int i=0;i<prome.length;i++)
       {
           resultados[i]=prome[i]*1;
       }
       System.out.println("Las calificaciones son respecrivamente: ");
       for(int i=0;i<prome.length;i++)
       {
        System.out.println(resultados[i] + " ");
       }
       resultado = resultado/prome.length;
       System.out.println("El proemdio de las calificaciones es: "+resultado);
       for(int i=0;i<prome.length;i++)
       {
           num3=prome[i];
           if(num3>resultado)
           {
            cont3 += 1;
           }
       }
       System.out.println("El numero de calificaciones mas altas al proemdio son: "+cont3);
       System.out.println("La cantidad de alumnmos reprobados son: "+cont1+ ". La cantidad de alumnos aprobados son: "+cont2);
       System.out.println("La calificacion mas baja es: "+num2+ ". La calificacion mas alta es: "+num1);
    }
    public void MatrizUwU()
    {
        int matriz_a [][]=new int[3][3];
        int matriz_b [][]=new int[3][3];
        int matriz_s [][]=new int[3][3];
        //Llenado de matriz
        for(int i=0;i<matriz_a.length;i++)
        {
            for(int j=0;j<matriz_a.length;j++)
            {
                matriz_a[i][j]=(int) (Math.random()*100);
            }
        }
        for(int i=0;i<matriz_b.length;i++)
        {
            for(int j=0;j<matriz_b.length;j++)
            {
                matriz_b[i][j]=(int) (Math.random()*100);
            }
        }
        for(int i=0;i<matriz_a.length;i++)
        {
            for(int j=0;j<matriz_b.length;j++)
            {
                matriz_s[i][j]=matriz_a[i][j]+matriz_b[i][j];
            }
        }
        for(int i=0;i<matriz_a.length;i++)
        {
            for(int j=0;j<matriz_a.length;j++)
            {
                System.out.print("{ "+matriz_a[i][j]+" }");
            } 
            System.out.print("\t");
            for(int j=0;j<matriz_b.length;j++)
            {
                System.out.print("{ "+matriz_b[i][j]+" }");
            }
            System.out.print("\t");
            for(int j=0;j<matriz_s.length;j++)
            {
                System.out.print("{ "+matriz_s[i][j]+" }");
            }
            System.out.println("");
        }
        
    }

}