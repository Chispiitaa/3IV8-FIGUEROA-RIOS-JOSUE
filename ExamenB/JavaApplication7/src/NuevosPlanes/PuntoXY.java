/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevosPlanes;

/**
 *
 * @author Josue
 */
public class PuntoXY {
	
	public int x;
	public int y;
	private boolean tocado;
	
	public PuntoXY(int x, int y) {
		this.x = x;
		this.y = y;
		tocado = false;
	}
	
	public boolean esTocado() {
		return tocado;
	}
	
	public void setTocado(boolean tocado) {
		this.tocado = tocado;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (objeto instanceof PuntoXY) {
			PuntoXY otroPunto = (PuntoXY)objeto;
			//Son iguales si coincide la X y la Y
			return (x == otroPunto.x && y == otroPunto.y);
		}
		else
			return false;
	}

}
