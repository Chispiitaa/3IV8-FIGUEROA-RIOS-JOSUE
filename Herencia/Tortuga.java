//Tipo de caparazon
public class Tortuga extends Animal{

    private String tipo_caparazon;

    public Tortuga(){

    }

    public Tortuga(String nombre, String raza, String tipo_alimento, int edad, String tipo_caparazon){
        super(nombre, raza, tipo_alimento, edad);
        this.tipo_caparazon = tipo_caparazon;
    }

    //recibe obtiene
    public int getTipoCaparazon(){
        return tipo_caparazon;
    }
    //envia u establecer
    public void setTipoCaparazon(String tipo_caparazon){
        this.tipo_caparazon = tipo_caparazon;
    }

    public void mostrarTortuga(){
        System.out.println("El nombre del gato es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su tipo de caparazon es: " + getTipoCaparazon());
    }
}