package xpong;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnoVsPc extends JFrame{
	
	 
	
	JLabel label = new JLabel("uno vs pc");
	JButton b1 = new JButton("este es mi boton "
			+ "orrible que debo de cambiar por "
			+ "un panel");
	
	public UnoVsPc() {
		 
		 
		this.setBounds(400,5,600, 600);
		this.setLayout(new BorderLayout());
		
		this.add(b1,BorderLayout.NORTH);
		this.add(label,BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

	
}
