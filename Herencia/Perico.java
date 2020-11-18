//Habla
public class Perico extends Animal{

    private String habla;

    public Perico(){

    }

    public Perico(String nombre, String raza, String tipo_alimento, int edad, String habla){
        super(nombre, raza, tipo_alimento, edad);
        this.habla = habla;
    }

    //recibe obtiene
    public int getHabla(){
        return habla;
    }
    //envia u establecer
    public void setHabla(String habla){
        this.habla = habla;
    }

    public void mostrarPerico(){
        System.out.println("El nombre del perico es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " habla de una manera: " + getHabla());
    }
}