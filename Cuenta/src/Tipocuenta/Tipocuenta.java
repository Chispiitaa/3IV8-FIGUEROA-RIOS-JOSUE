
package Tipocuenta;

import Persona.Cliente;
/**
 *
 * @author Josue
 */
public class Tipocuenta {
    
    //variables
    private int num_cuenta;
    private int num_tarjeta;
    private int [] fechavencimiento;
    private double saldo;
    private int NIP;
    private int cod_seguridad;
    
    public Tipocuenta() {
    }

    //constructor
    public Tipocuenta(int num_tarjeta, int[] fechavencimiento, double saldo, int NIP, int cod_seguridad) {
        this.num_tarjeta = num_tarjeta;
        this.fechavencimiento = fechavencimiento;
        this.saldo = saldo;
        this.NIP = NIP;
        this.cod_seguridad = cod_seguridad;
    }

    //los getters y los setters
    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public int[] getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(int[] fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public int getCod_seguridad() {
        return cod_seguridad;
    }

    public void setCod_seguridad(int cod_seguridad) {
        this.cod_seguridad = cod_seguridad;
    }
    
    //OPERACIONES DE UNA CUENTA
   
    public void consultarCuenta(){
        //Datos de la cuenta
        Cliente cli = new Cliente();
        System.out.println("El nombre del cliente: ");
        System.out.println(cli.getNombre());
        System.out.println("El numero de cuenta es:");
        System.out.println(cli.getNum_cuenta());
        System.out.println("Su saldo al dia de hoy es de:");
        System.out.println(this.saldo);
    }
    
    public void depositar(double monto){
        //agregar el monto
        this.saldo += monto;
    }
    
    public void retirar(double monto){
        //quitar un cantidad
        if(this.saldo < monto){
            System.out.println("Cuenta con saldo insuficiente, consigue trabajo Vago");
        }else{
            this.saldo -= monto;
            System.out.println("Gracias por usar a Manguito");
        }
        
    }
}
