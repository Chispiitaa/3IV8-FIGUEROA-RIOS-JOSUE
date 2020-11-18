//Tipo de caparazon
public class Hamster extends Animal{

    private String elasticidad;

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String elasticidad){
        super(nombre, raza, tipo_alimento, edad);
        this.elasticidad = elasticidad;
    }

    //recibe obtiene
    public int getHamster(){
        return elasticidad;
    }
    //envia u establecer
    public void setElasticidad(String elasticidad){
        this.elasticidad = elasticidad;
    }

    public void mostrarHamster(){
        System.out.println("El nombre del gato es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su tipo de caparazon es: " + getHamster());
    }
}