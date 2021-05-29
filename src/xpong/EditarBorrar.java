package xpong;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class EditarBorrar extends JFrame {

	
	JPanel panchito = new JPanel();
		
		
	JLabel labelID = new JLabel("ID");
	JTextField textoID= new JTextField (20);
	
	JLabel labelName = new JLabel("Nickmane");
	JTextField textoName= new JTextField (20);
		
	JLabel labelPuntos = new JLabel("puntos");
	JTextField textoPuntos= new JTextField (20);

	JLabel labelFrase = new JLabel("Frase");
	JTextField textoFrase= new JTextField (20);
	

			JButton borrar = new JButton("Borrar");
			JButton editar= new JButton("Editar");
			
			
			
	
	public EditarBorrar(){
		
		 GestionBotones gb = new GestionBotones(this);
		 borrar.addActionListener(gb);
		 editar.addActionListener(gb);
		
		panchito.add(labelID);
		panchito.add(textoID);
		
		panchito.add(labelName);
		panchito.add(textoName);
		
		panchito.add(labelPuntos);
		panchito.add(textoPuntos);
		
		panchito.add(labelFrase);
		panchito.add(textoFrase);
		panchito.add(borrar);
		panchito.add(editar);
		
		this.setBounds(400,5,320, 600);
		this.setLayout(new BorderLayout());
		
		this.add(panchito,BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
