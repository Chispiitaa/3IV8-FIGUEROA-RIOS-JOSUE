//libreria
import javax.swing.JOptionPane;

public class Proovedor{
    //Atributos
    private String nombre_cliente;
    private int resultados, promedio, min, max, resultadop;
    
    public void llenadoArreglo(){
        
        String [] producto = new String[10];
        int [] costo = new int[10];
        int [] cantidad_producto = new int[10];
        

        nombre_cliente = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
        for(int i=0;i<producto.length;i++){
            JOptionPane.showInputDialog(null, "Introduzca el nombre del producto: " + (i+1)+" ");
        }
        for(int i=0;i<costo.length;i++){
            costo[i] = Integer.parseInt(JOptionPane.showInputDialog(null,  "Introduzca el costo del producto: " + (i+1)+" "));
            resultados += costo[i]; 
        }
        for(int j=0;j<cantidad_producto.length;j++){
            cantidad_producto[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad del producto: " + (j+1)+" "));
        }
        
        min = max = costo[0];
        for (int  i= 0; i < costo.length; i++){
            if(costo[i] > max){
                max = costo[i];
            }
            else if(costo [i] < min){
                min = costo[i];
            }
        }
        
        int  resultado []= multiplicador(costo, cantidad_producto);
        
        promedio = resultados/costo.length;
        
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre_cliente);
        JOptionPane.showMessageDialog(null, "El total de costos es de: " + resultados);
        JOptionPane.showMessageDialog(null, "Costo mayor: " + max);
        JOptionPane.showMessageDialog(null, "Costo menor: " + min);
        JOptionPane.showMessageDialog(null, "El promedio de los costos es de: " + promedio);
        JOptionPane.showMessageDialog(null, "Los costos de cada producto: ");
        mostrarArray(resultado);
        for(int i=0; i<producto.length; i++ ){
            JOptionPane.showMessageDialog(null, "El nombre del producto es: "+(i+1)+" "+producto[i]);
            
        }
    }

    public static void mostrarArray(int lista[]){

        for(int i = 0; i<lista.length; i++){
            JOptionPane.showMessageDialog(null,"En el producto "+(i+1)+" hay: " + lista[i] + " en pesos.");
        }
    }
        public  static int[] multiplicador(int costo[], int cantidad_producto[]) {
        int resultado [] =new int[costo.length];

        for(int i=0; i<costo.length; i++){
            resultado[i] = costo[i]*cantidad_producto[i];
        }
        return resultado;
    }

}