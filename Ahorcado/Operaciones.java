public class Operaciones{
    
    //Pediremos los mensajes segun la condicion.
    public static void mostrarResultado(int vidas){
        if(vidas==5){
        System.out.println("Empieza el juego, crack.");
        }   
        
        if(vidas==4){
        System.out.println("Pana, ten mas cuidado.");     
        }      
   
        if(vidas==3){
        System.out.println("Pana, por favor, cuidate, protegete, mas vale prevenir.");        
        }                
   
        if(vidas==2){
        System.out.println("Te estoy diciendo, que tenga mas cuidado.");       
        }
   
        if(vidas==1){
        System.out.println("Weon, se te estan quemando las tortillas.");       
        }

        if(vidas==0){
        System.out.println("Te lo dije, a ver como comes.");        
        }    
    }
}