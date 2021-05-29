package xpong;
import java.awt.*;

public class Puntos extends Rectangle{

	public static int juegoAncho;
	public static int juegoAlto;
	public int jugador1;
	public int jugador2;
	
	 public Puntos(int juegoAncho, int juegoAlto){
		Puntos.juegoAncho = juegoAncho;
		Puntos.juegoAlto = juegoAlto;
	}


	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Consolas",Font.PLAIN,60));
		
		g.drawLine(juegoAncho/2, 0, juegoAncho/2, juegoAlto);
		
		g.drawString( String.valueOf(jugador1/10)+String.valueOf(jugador1%10), (juegoAncho/2)-85, 50);
		g.drawString(String.valueOf(jugador2/10)+String.valueOf(jugador2%10), (juegoAncho/2)+20, 50);
	}
}









