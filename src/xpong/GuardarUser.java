package xpong;

import java.awt.BorderLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JFrame;

public class GuardarUser extends JFrame {
	
	
	
	JPanel pan = new JPanel(); 
	
	JLabel label = new JLabel("Nickmane");
	JTextField texto= new JTextField (20);
	
	JLabel label2 = new JLabel("Frase");
	JTextField texto2= new JTextField (20);
	
	JButton Guardar = new JButton("Guardar Usuario");
	
	public GuardarUser () {
		
		
		GestionBotones gb = new GestionBotones(this);
		 Guardar.addActionListener(gb);
				
		pan.add(label);
		pan.add(texto);
		
		pan.add(label2);
		pan.add(texto2);
		
		pan.add(Guardar);
		
		this.setBounds(200,200,325,200);
		this.setLayout(new BorderLayout());
		
		this.add(pan,BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	 
	

}
