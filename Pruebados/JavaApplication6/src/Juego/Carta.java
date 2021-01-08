
package Juego;

/**
 *
 * @author Josue
 */
import javax.swing.*;

public class Carta extends JLabel {
    public char color;
    public int numero;
    public ImageIcon img;
    
    public Carta(char c, int n, ImageIcon i){
        super(i);
        color = c;
        numero = n;
        img = i;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
    
    
}
