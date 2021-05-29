package xpong;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.BorderLayout;

public class Seleccion extends JFrame implements ActionListener   {
	
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton  b1 = new JButton("1 jugador");
	
	JButton  b2 = new JButton("2 jugadores");
	
	JButton  b3 = new JButton("agregar usar");
	JButton  b4 = new JButton("Editar o borrar");
	
	
	 public Seleccion(String pong,int x, int y, int ancho, int alto){
		 super(pong);
		 
		 b1.setFocusable(false);
		 b1.addActionListener(this);
		 b1.setFont(new Font(null, Font.PLAIN,25)); //necesito otra vercio nde java
		 
		 
		 b2.setFocusable(false);
		 b2.addActionListener(this);
		 b2.setFont(new Font(null, Font.PLAIN,25));
		 
		 b3.setFocusable(false);
		 b3.addActionListener(this);
		 
		 b4.setFocusable(false);
		 b4.addActionListener(this);
		
		 
		
		 panel1.add(b1);
		 panel1.add(b2);
		 panel2.add(b3);
		 panel2.add(b4);
		
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setBounds(x,y,ancho, alto);
		 this.setLayout(new BorderLayout());
		 this.setVisible(true);
		
	    this.add(panel1,BorderLayout.NORTH);
	    this.add(panel2,BorderLayout.CENTER);
	   
	}
	
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b1) {
			 this.dispose();
			 UnoVsPc  UnoVsPc = new UnoVsPc();
			 
		 }
		 if(e.getSource()==b2) {
			 this.dispose();
			 UnoVsUno  unovsuno = new UnoVsUno("pong", 5, 5, 1300, 700);
		 }
		 
		 if(e.getSource()==b3) {
			 

			 GuardarUser  guardar = new GuardarUser();
		 }

		 if(e.getSource()==b4) {
			 

			 EditarBorrar  editarBorrar = new EditarBorrar();
		 }

		 


	 }
	
	 

}
