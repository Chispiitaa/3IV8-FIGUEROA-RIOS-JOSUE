
package serializacion;

/**
 *
 * @author Josue
 */


//vamos a crear un molde
import java.io.Serializable;

//cuando nosotros necesitamos generar un archivo de una clase
//se debe incluir la palabra reservada implements
public abstract class Persona implements Serializable{
    //una clase abstracta, nos sirve como molde para poder aplicar
    //de forma suerperior polimorfiso
    
    private String nombre;
    private int edad;

    public Persona() {
    }
    
  
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //amos a crear una persona que se transforme en un alumno o un profesor
    abstract String tipoPersona();
}
