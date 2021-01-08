/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.ImageIcon;

/**
 *
 * @author Josue
 */
public class CartaEspecial extends Carta{
    public static String TOMAR2 = "TOMA2";
    public static String REVERSA = "REVERSA";
    public static String SALTA = "SALTA";
    public static String COMODINCOLOR = "COMODINCOLOR";
    public static String COMODINTOMA4 = "COMODINTOMA4";
    public static String nombre;
    
    public CartaEspecial(char c, ImageIcon i, String nom){
        super(c, 10, i);
        nombre = nom;
    }
    
    
}
