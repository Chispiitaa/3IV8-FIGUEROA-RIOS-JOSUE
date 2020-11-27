//librerias
import javax.swing.JOptionPane;

//clase
public class Sueldo{
    //Atributos
    private int id_empleado;
    private String puesto;
    private int quincena = 5000;
    private double quincena2 = 8000.0;
    private int opc; 
    private String nombre_empleado;
    private int hed, hen;
    private double resultado;

    public Sueldo(){
        //constructor
    }
    public void menusito() {
    //Creamos un menu
    
    try {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Elieja la opcion correspondiente \nTu puesto de trabajo es: \n1. Empleado.\n2. Supervisor."));
    } catch (Exception e) {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Elieja la opcion correspondiente \nTu puesto de trabajo es: \n1. Empleado.\n2. Supervisor."));
    }
    while(opc>2 || opc<1){
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Elieja la opcion correspondiente \nTu puesto de trabajo es: \n1. Empleado.\n2. Supervisor."));
    }
    switch (opc) {
        case 1:
            JOptionPane.showMessageDialog(null, "Le recordamos su ID: \n123456.");
            empleado();
        break;
        case 2:
            JOptionPane.showMessageDialog(null, "Le recordamos su ID: \n654321.");
            supervisor();
        break;
        }
    }

    public void empleado(){
        nombre_empleado = JOptionPane.showInputDialog(null, "Ingrese su nombre.");
        hed = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas extras diurnas."));
        hen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas extras nocturnas."));
        hed=hed*50;
        hen=hen*60;
        quincena += hed+hen;
        id_empleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ID"));
        do{
            id_empleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Error: \nIngrese su ID"));
        }while(id_empleado != 123456);
        dineroempleado();
    }

    public void supervisor(){
        nombre_empleado = JOptionPane.showInputDialog(null, "Ingrese su nombre.");
        resultado += 8000*.2;
        resultado *=.1;
        resultado *=.16;
        quincena2 += resultado;    
        id_empleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ID"));
        do{
            id_empleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Error: \nIngrese su ID"));
        }while(id_empleado != 654321);
        dineroempleado();
    }

    public void dineroempleado(){
        JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre_empleado + " ID: " +id_empleado + " su sueldo quincenal es de: " + quincena);
    }
}