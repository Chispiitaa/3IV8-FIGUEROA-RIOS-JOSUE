import javax.swing.JOptionPane;
import java.util.Scanner;
class Principalmain
{
    public static void main(String[] args) 
    {
        Scanner leer2=new Scanner(System.in);
        char letra;
        JOptionPane.showMessageDialog(null, "3IV8_FIGUEROA_RIOS_JOSUE.");
        JOptionPane.showMessageDialog(null, "Asi es panita, soy yo.");
        Arreglos ob=new Arreglos();
        do{ 
        ob.ejercicios();
        JOptionPane.showInputDialog("Si desea repetir el programa, digite 's'.");
        letra=leer2.next().charAt(0);
        }while(letra=='s');
    }

}