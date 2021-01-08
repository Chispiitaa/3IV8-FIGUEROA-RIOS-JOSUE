/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tipocuenta;

/**
 *
 * @author Josue
 */
public class Credito extends Tipocuenta {
    
    private double lim_credito;
    
    
    public Credito(int num_tarjeta, int[] fechavencimiento, double saldo, int NIP, int cod_seguridad, double lim_credito) {
        super(num_tarjeta, fechavencimiento, saldo, NIP, cod_seguridad);
        this.lim_credito = lim_credito;
    }

    public double getLim_credito() {
        return lim_credito;
    }

    public void setLim_credito(double lim_credito) {
        this.lim_credito = lim_credito;
    }
    
    
    
}
