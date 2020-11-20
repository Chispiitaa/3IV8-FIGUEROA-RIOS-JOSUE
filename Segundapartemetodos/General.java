/*
Este sera una clase general, donde heredaremos algunos atributos
que nos ayudaran a los programas 
*/
public class General{

    //Atributos
    private String nombre;
    
    public General(){
        //Constructor
    }

    //Acceder a las variables
    public General(String nombre) {
        this.nombre = nombre;
    }

    //el metodo get
    public String getNombre(){
        return nombre;
    }
    //El metodo set
    public void setName(String nombre) {
        this.nombre = nombre;
    }
}