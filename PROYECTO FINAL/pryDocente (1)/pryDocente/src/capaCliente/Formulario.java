/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaCliente;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class Formulario {
    private int horasEscuela;
    private int horasAct;
    private int horsaEstudio;
    ArrayList<Formulario> datosF = new ArrayList();

    public Formulario(){
        
    }
    
    public Formulario(int horasEscuela, int horasAct, int horsaEstudio) {
        this.horasEscuela = horasEscuela;
        this.horasAct = horasAct;
        this.horsaEstudio = horsaEstudio;
    }

    

    public int getHorasEscuela() {
        return horasEscuela;
    }

    public void setHorasEscuela(int horasEscuela) {
        this.horasEscuela = horasEscuela;
    }

    public int getHorasAct() {
        return horasAct;
    }

    public void setHorasAct(int horasAct) {
        this.horasAct = horasAct;
    }

    public int getHorsaEstudio() {
        return horsaEstudio;
    }

    public void setHorsaEstudio(int horsaEstudio) {
        this.horsaEstudio = horsaEstudio;
    }
    
    public void agregar(Formulario f){
        datosF.add(f);
    }
    
    public void mostrar(){
        for (int i = 0; i < datosF.size(); i++) {
            System.out.println(i);
        }
    }
    
    
}
