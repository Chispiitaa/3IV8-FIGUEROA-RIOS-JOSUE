import java.util.Scanner;
class ExamenPrim{
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        String charmander="charmander", bulbasaor="bulbasaor", squartle="squartle";
        int opcion, opcion1;
        char volver;
        int vidachar=150;
        double fuerzachar=400, defensachar=300, ataqueunochar=150, ataquedoschar=200, id1=2020140891, producto, producto2;
        int vidabulbasaor=130;
        double fuerzabul=300, defensabul=400, ataqueunobul=140, ataquedosbul=200, id2=212345654;
        int vidasquartle=145;
        double fuerzsqua=300, defensasqua=500, ataqueunosqua=120, ataquedossqua=150, id3=345678233;
        do{  
        System.out.println("3IV8_FIGUEROA_RIOS_JOSUE."); 
        System.out.println("1.- Informacion del pokemon 'charmander'."); 
        System.out.println("2.- Informacion del pokemon 'bulbasaor'."); 
        System.out.println("3.- Informacion del pokemon 'squartle'."); 
        System.out.println("4.- 'Batalla Pokemon.'.");
        System.out.println("4.- Salir.");
        opcion=leer.nextInt();
        switch (opcion) {
            case 1:
            System.out.println("El nombre del personaje es: "+charmander);
           
            System.out.println("La vida del pokemon es: "+vidachar);
            
            System.out.println("El 'id' del personaje es: "+id1);
            
            System.out.println("La fuerza del personaje es: "+fuerzachar);
            
            System.out.println("La defensa del persobaje es de: "+defensachar);
            
            System.out.println("El ataque principal de charmander es 'hiedra venenosa' que es de: "+ataqueunochar);
            
            System.out.println("El ataque secundario de charmander es 'volcan de fuego' que es de: "+ataquedoschar);
           
                break;
                case 2:
                System.out.println("El nombre del personaje es: "+bulbasaor);
               
                System.out.println("La vida del pokemon es: "+vidabulbasaor);
                
                System.out.println("El 'id' del personaje es: "+id2);
                
                System.out.println("La fuerza del personaje es: "+fuerzabul);
               
                System.out.println("La defensa del persobaje es de: "+defensabul);
                
                System.out.println("El ataque principal de charmander es 'quemadura Juan' que es de: "+ataqueunobul);
                
                System.out.println("El ataque secundario de charmander es 'pollito ardiente' que es de: "+ataquedosbul);
                
                break;
                case 3:
                System.out.println("El nombre del personaje es: "+squartle);
               
                System.out.println("La vida del pokemon es: "+squartle);
                
                System.out.println("El 'id' del personaje es: "+id3);
               
                System.out.println("La fuerza del personaje es: "+fuerzsqua);
                
                System.out.println("La defensa del persobaje es de: "+defensasqua);
              
                System.out.println("El ataque principal de charmander es 'pum' que es de: "+ataqueunosqua);
               
                System.out.println("El ataque secundario de charmander es 'volaris' que es de: "+ataquedossqua);
                break;
                case 4:
                do{ 
                System.out.println("1.-Pelea entre charmander y bulbasaor. ");
                System.out.println("2.-Pelea entre charmander y squartle. ");
                System.out.println("3.-Pelea entre bulbasaor y squartle. ");
                opcion1=leer.nextInt();
                switch (opcion1) {
                    case 1:
                    System.out.println("Los combatientes son: charmander y bulbasaor."); 
                    System.out.println("Informacion del pokemon 'charmander': ");
                    System.out.println("El nombre del personaje es: "+charmander);
           
                    System.out.println("La vida del pokemon es: "+vidachar);
            
                    System.out.println("El 'id' del personaje es: "+id1);
            
                    System.out.println("La fuerza del personaje es: "+fuerzachar);
            
                    System.out.println("La defensa del persobaje es de: "+defensachar);
            
                    System.out.println("El ataque principal de charmander es 'hiedra venenosa' que es de: "+ataqueunochar);
            
                    System.out.println("El ataque secundario de charmander es 'volcan de fuego' que es de: "+ataquedoschar);
                    System.out.println("Informacion del pokemon 'bulbasaor': ");
            
                    System.out.println("El nombre del personaje es: "+bulbasaor);
               
                    System.out.println("La vida del pokemon es: "+vidabulbasaor);
                
                    System.out.println("El 'id' del personaje es: "+id2);
                
                    System.out.println("La fuerza del personaje es: "+fuerzabul);
               
                    System.out.println("La defensa del persobaje es de: "+defensabul);
                
                    System.out.println("El ataque principal de charmander es 'quemadura Juan' que es de: "+ataqueunobul);
                
                    System.out.println("El ataque secundario de charmander es 'pollito ardiente' que es de: "+ataquedosbul);
                    producto=(fuerzachar*defensachar)/3;
                    producto2=(fuerzabul*defensabul)/3;
                   

                        
                        break;
                    case 2:
                    System.out.println("Los combatientes son: charmander y squartle.");
                    System.out.println("Informacion del pokemon: ");
                    System.out.println("El nombre del personaje es: "+bulbasaor);
               
                    System.out.println("La vida del pokemon es: "+vidabulbasaor);
                
                    System.out.println("El 'id' del personaje es: "+id2);
                
                    System.out.println("La fuerza del personaje es: "+fuerzabul);
               
                    System.out.println("La defensa del persobaje es de: "+defensabul);
                
                    System.out.println("El ataque principal de charmander es 'hiedra venenosa' que es de: "+ataqueunobul);
                
                    System.out.println("El ataque secundario de charmander es 'volcan de fuego' que es de: "+ataquedosbul);
                    default:
                        
                }
                System.out.println("Si desea repetir el programita hermoso (ni es hermoso) oprima a.");
                volver=leer.next().charAt(0);
                 }while(volver=='a');
                               
           
            default:
               System.out.println("Favor de no morir en el intento. Besitos.");
            
        }

        System.out.println("Si desea repetir el programita hermoso (ni es hermoso) oprima r.");
        volver=leer.next().charAt(0);
         }while(volver=='r');
    }




}