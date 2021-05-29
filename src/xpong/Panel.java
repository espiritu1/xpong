package xpong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel implements Runnable{

	public static final int juegoAncho = 1300;
	public static final int juegoAlto = 600;
	public static final Dimension SCREEN_SIZE = new Dimension(juegoAncho,juegoAlto);
	public static final int diamtroPelota = 20;
	public static final int raquetaAncho= 25;
	public static final int raquetaAlto = 100;
	Thread hiloDelJuego;
	Image imagen;
	Graphics graficos;
	Random random;
	Raqueta raqueta1;
	Raqueta raqueta2;
	Pelota pelota;
	Puntos puntos;
	
	public Panel(){
		Raquetas();
		Pelota();
		puntos = new Puntos(juegoAncho,juegoAlto);
		this.setFocusable(true);
		this.addKeyListener(new AL());
		this.setPreferredSize(SCREEN_SIZE);
		
		hiloDelJuego = new Thread(this);
		hiloDelJuego.start();
	}
	
	public void Pelota() {
		random = new Random();
		pelota = new Pelota((juegoAncho/2)-(diamtroPelota/2),random.nextInt(juegoAlto-diamtroPelota),diamtroPelota,diamtroPelota);
	}
	public void Raquetas() {
		raqueta1 = new Raqueta(0,(juegoAlto/2)-(raquetaAlto/2),raquetaAncho,raquetaAlto,1);
		raqueta2 = new Raqueta(juegoAncho-raquetaAncho,(juegoAlto/2)-(raquetaAlto/2),raquetaAncho,raquetaAlto,2);
	}
	public void paint(Graphics g) {
		imagen = createImage(getWidth(),getHeight());
		graficos = imagen.getGraphics();
		draw(graficos);
		g.drawImage(imagen,0,0,this);
	}
	public void draw(Graphics g) {
		raqueta1.dibujar(g);
		raqueta2.dibujar(g);
		pelota.draw(g);
		puntos.draw(g);
Toolkit.getDefaultToolkit().sync(); // I forgot to add this line of code in the video, it helps with the animation

	}
	public void mover() {
		raqueta1.mover();
		raqueta2.mover();
		pelota.move();
	}
	public void Colicion() {
		
		//bounce ball off top & bottom window edges
		if(pelota.y <=0) {
			pelota.YDireccion(-pelota.yVelocidad);
		}
		if(pelota.y >= juegoAlto-diamtroPelota) {
			pelota.YDireccion(-pelota.yVelocidad);
		}
		//bounce ball off paddles
		if(pelota.intersects(raqueta1)) {
			pelota.xVelocidad = Math.abs(pelota.xVelocidad);
			pelota.xVelocidad++; //optional for more difficulty
			if(pelota.yVelocidad>0)
				pelota.yVelocidad++; //optional for more difficulty
			else
				pelota.yVelocidad--;
			pelota.XDireccion(pelota.xVelocidad);
			pelota.YDireccion(pelota.yVelocidad);
		}
		if(pelota.intersects(raqueta2)) {
			pelota.xVelocidad = Math.abs(pelota.xVelocidad);
			pelota.xVelocidad++; //optional for more difficulty
			if(pelota.yVelocidad>0)
				pelota.yVelocidad++; //optional for more difficulty
			else
				pelota.yVelocidad--;
			pelota.XDireccion(-pelota.xVelocidad);
			pelota.YDireccion(pelota.yVelocidad);
		}
		//esto detiene a la raqueta
		if(raqueta1.y<=0)
			raqueta1.y=0;
		if(raqueta1.y >= (juegoAlto-raquetaAlto))
			raqueta1.y = juegoAlto-raquetaAlto;
		if(raqueta2.y<=0)
			raqueta2.y=0;
		if(raqueta2.y >= (juegoAlto-raquetaAlto))
			raqueta2.y = juegoAlto-raquetaAlto;
		//give a player 1 point and creates new paddles & ball
		if(pelota.x <=0) {
			puntos.jugador2++;
			Raquetas();
			Pelota();
			System.out.println("Player 2: "+puntos.jugador2);
		}
		if(pelota.x >= juegoAncho-diamtroPelota) {
			puntos.jugador1++;
			Raquetas();
			Pelota();
			System.out.println("Player 1: "+puntos.jugador1);
		}
	}
	public void run() {
		//game loop
		long lastTime = System.nanoTime();
		double amountOfTicks =60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now -lastTime)/ns;
			lastTime = now;
			if(delta >=1) {
				mover();
				Colicion();
				repaint();
				delta--;
			}
		}
	}
	public class AL extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			raqueta1.keyPressed(e);
			raqueta2.keyPressed(e);
		}
		public void keyReleased(KeyEvent e) {
			raqueta1.keyReleased(e);
			raqueta2.keyReleased(e);
		}
	}
}