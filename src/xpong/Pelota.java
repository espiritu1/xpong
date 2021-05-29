package xpong;

import java.awt.*;
import java.util.*;

public class Pelota extends Rectangle{

	public Random random;
	public int xVelocidad;
	public int yVelocidad;
	public int velocidadInicial = 2;
	
	public Pelota(int x, int y, int ancho, int alto){
		super(x,y,ancho,alto);
		random = new Random();
		int randomXDireccion = random.nextInt(2);
		if(randomXDireccion == 0)
			randomXDireccion--;
		XDireccion(randomXDireccion*velocidadInicial);
		
		int randomYDireccion = random.nextInt(2);
		if(randomYDireccion== 0)
			randomYDireccion--;
		YDireccion(randomYDireccion*velocidadInicial);
		
	}
	
	public void XDireccion(int randomXDireccion) {
		xVelocidad = randomXDireccion;
	}
	public void YDireccion(int randomYDireccion) {
		yVelocidad = randomYDireccion;
	}
	public void move() {
		x += xVelocidad;
		y += yVelocidad;
	}
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, height, width);
	}
}