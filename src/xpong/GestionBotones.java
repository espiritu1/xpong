package xpong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GestionBotones implements ActionListener  {
	EditarBorrar ventana;
	GuardarUser ventana2;

	
	public GestionBotones (EditarBorrar ventana){
	    this.ventana= ventana;
	
	  }
	
	
	public GestionBotones (GuardarUser ventana2){
	    this.ventana2= ventana2;
	
	  }
	
	
	
	public void actionPerformed (ActionEvent e){
		
		String accion = e.getActionCommand();
		
		 if (accion.equals("Borrar")){
			 System.out.println("gomaljljlljljlj");
             //ventana.panelDibujo.a = -1;           esta parte no va
             //ventana.panelDibujo.b = -90;
             //ventana.panelDibujo.repaint();

           }
		 if (accion.equals("Editar")){
			 System.out.println("22222");
             //ventana.panelDibujo.a = -1;           esta parte no va
             //ventana.panelDibujo.b = -90;
             //ventana.panelDibujo.repaint();

           }
		 if (accion.equals("Guardar Usuario")){
			 System.out.println("gggg");
             //ventana.panelDibujo.a = -1;           esta parte no va
             //ventana.panelDibujo.b = -90;
             //ventana.panelDibujo.repaint();

           }
		
		
		
	}
	
}
