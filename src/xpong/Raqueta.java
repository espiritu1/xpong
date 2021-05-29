package xpong;

import java.awt.*;
import java.awt.event.*;

public class Raqueta extends Rectangle{

	public int id;
	public int yvelocidad;
	public int velocidad = 10;
	
	public Raqueta(int x, int y, int raquetaAncho, int raquetaAlto, int id){
		super(x,y,raquetaAncho,raquetaAlto);
		this.id=id;
	}
	
	  public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				YDireccion(-velocidad);
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				YDireccion(velocidad);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				YDireccion(-velocidad);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				YDireccion(velocidad);
			}
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				YDireccion(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				YDireccion(0);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				YDireccion(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				YDireccion(0);
			}
			break;
		}
	}
	public void YDireccion(int yDireccion) {
		yvelocidad = yDireccion;
	}
	public void mover() {
		y= y + yvelocidad;
	}
	public void dibujar(Graphics g) {
		if(id==1)
			g.setColor(Color.yellow);
		else
			g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
}