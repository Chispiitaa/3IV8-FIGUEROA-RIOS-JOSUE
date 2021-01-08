package ove;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class procesos implements Serializable{
    
    private ArrayList<ingresar> listalibros;
    
    private leer objarchivo = new leer();
    
    
    public procesos(){
        listalibros = new ArrayList<ingresar>();
        listalibros = objarchivo.leer();
    }
    
    public void agregarLibro(){
        String respuesta = "si";
        
        while(respuesta == "si"){
            ingresar objlibro = new ingresar();
            objlibro.aceptaDatos();
            listalibros.add(objlibro);
            respuesta = JOptionPane.showInputDialog("EXITO ROTUNDO.\n"+ "¿DESEAS AGREGAR OTRO USUARIO, PANITA?.");
        }
    }
    
    public void consultaGral(){
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"MI PANA, NO HAY USUARIOS REGISTRADOS.");
        }else{
            JOptionPane.showMessageDialog(null,"PERMITEME, TE LOS DIGO:\n");
            for(int i = 0; i<listalibros.size(); i++){
                JOptionPane.showMessageDialog(null,"SE LLAMA: " + listalibros.get(i).getNombre()+ ".\n"+ "SU EDAD: " + listalibros.get(i).getEdad()+ ".\n"+ "EL HARDCORE PUNTAJE: " + listalibros.get(i).getPrecio()+ ".\n");
            }
            
        }
    }
    
    private int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < listalibros.size(); i++){
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
            }
        }
        if(!existe){
            JOptionPane.showMessageDialog(null,"NO SE ENCUENTRA, PANITA");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"ÑO HAY.");
        }
        else{
        nombreBusca = JOptionPane.showInputDialog("INGRESA EL NOMBRE, POR FIS:");
        
        posBuscando = traePosicion(nombreBusca);
        
        JOptionPane.showMessageDialog(null,"NOMBRE: " + listalibros.get(posBuscando).getNombre() + "EDAD: " + listalibros.get(posBuscando).getEdad()+ "PUNTAJE: " + listalibros.get(posBuscando).getPrecio()+ "ID: " + listalibros.get(posBuscando));
        }
        return posBuscando;
    }
    
    public void borrar(){
        String libroBorrar;
        int posBorrar;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"ÑO HAY.");
        }else{
            posBorrar = buscar();
            if(posBorrar < listalibros.size()){
                listalibros.remove(posBorrar);
                JOptionPane.showMessageDialog(null,"PAL PISO, LOCO.");
            }
        }
    }
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "si";
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"{O HAY.");
        }
        else{
            nombreModificar = JOptionPane.showInputDialog("DIME EL NOMBRE DEL JUGADOR:");
        
        while("si".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            if(posModificar <= 0);
            resMods = Integer.parseInt(JOptionPane.showInputDialog("\nSELECCIONA EL DATTO:"+ "\n1.-nombre"+ "\n2.-edad."));
                
                switch (resMods) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"SU NOMBRE ES: "
                                + listalibros.get(posModificar).getNombre());
                        listalibros.get(posModificar).setNombre(JOptionPane.showInputDialog("INGRESE EL NUEVO NOMBRE DE USUARIO:"));
                        JOptionPane.showMessageDialog(null,"\nNombre del usuario: " + listalibros.get(posModificar).getNombre());
                    break;
                    
                    case 2:
                        JOptionPane.showMessageDialog(null,"LA EDAD DEL USUARIO: "
                                + listalibros.get(posModificar).getEdad());
                        listalibros.get(posModificar).setEdad(Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA EDAD:")));
                        JOptionPane.showMessageDialog(null,"\nEdad: " + listalibros.get(posModificar).getEdad());
                    break;                
                }
            opcion = JOptionPane.showInputDialog("DESEAS CONTINUAR, PANNA");        
        }
        }
    }

    public ArrayList<ingresar> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<ingresar> listalibros) {
        this.listalibros = listalibros;
    }

    public leer getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(leer objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    public void grabar(){
        getObjarchivo().serializar(listalibros);
    }
}