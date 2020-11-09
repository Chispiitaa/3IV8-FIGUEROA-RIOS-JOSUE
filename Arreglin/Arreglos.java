import java.util.Scanner;
import javax.swing.JOptionPane;
public class Arreglos
{
    Scanner leer=new Scanner(System.in);
    public void ejercicios()
    {
        char letra;
        Scanner leer=new Scanner(System.in);
        int opcion;
        System.out.println("1.-Numeros positivos y negativos.");
        System.out.println("2.-Promedio.");
        System.out.println("3.-Calificaciones.");
        System.out.println("4.-Matriz.");
        System.out.println("5.-Salir.");
        opcion=leer.nextInt();
        while(opcion<=0 || opcion>=6)
        {
            System.out.println("1.-Numeros positivos y negativos.");
            System.out.println("2.-Promedio.");
            System.out.println("3.-Calificaciones.");
            System.out.println("4.-Matriz.");
            System.out.println("5.-Salir.");
            opcion=leer.nextInt();
        }
        MetodosArreglos obj2=new MetodosArreglos();
        switch (opcion)
        {
            case 1:
                do{ 
                obj2.NumeritosUwU();
                System.out.println("Si desea repetir el caso, digite 's'.");
                letra=leer.next().charAt(0);
                 }while(letra=='s');
                break;
            case 2:
                do{ 
                obj2.PromedioUwU();
                System.out.println("Si desea repetir el caso, digite 's'.");
                letra=leer.next().charAt(0);
                 }while(letra=='s');
                break;
            case 3:
                
                do{ 
                    obj2.CalificacionesUwU();
                    System.out.println("Si desea repetir el caso, digite 's'.");
                    letra=leer.next().charAt(0);
                     }while(letra=='s');
                    
                break;
            case 4:
                do{ 
                    obj2.MatrizUwU();
                    System.out.println("Si desea repetir el caso, digite 's'.");
                    letra=leer.next().charAt(0);
                     }while(letra=='s');
                break;
            default:
            JOptionPane.showMessageDialog(null, "Hasta luego 'Guerrero', fue un honor.");
        } 
    }
}