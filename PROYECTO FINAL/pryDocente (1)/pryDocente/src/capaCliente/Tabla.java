
package capaCliente;

/**
 *
 * @author Josue
 */
public class Tabla {
    private String nombre = null;
    private String actividad = null;
    private int dia;
    private int horas;
    
    public Tabla(){
        //Ñe
    }

    public Tabla(String nombre, String actividad, int dia, int horas) {
        this.nombre = nombre;
        this.actividad = actividad;
        this.dia = dia;
        this.horas = horas;
       
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
}
