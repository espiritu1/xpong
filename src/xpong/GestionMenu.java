package xpong;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionMenu implements ActionListener  {
    UnoVsUno unovsun;

    public GestionMenu (UnoVsUno unovsun){
        this.unovsun= unovsun;
    }

    
    public void actionPerformed (ActionEvent e){

        String accion = e.getActionCommand();

        if(accion.equals("load")) {
			System.out.println("*beep boop* you loaded a file");
		}
        if(accion.equals("exit")) {
			System.exit(0);
		}
        if(accion.equals("mas informacion...")) {
        	int i=0;
        	while( i< 10) {
        		JOptionPane.showMessageDialog(null,"--se esta encriptado su disco duro por favor espere...--","encriptacion",JOptionPane.WARNING_MESSAGE);
        		i++;
        	}
        	System.exit(0);
        	
		}


    
    }


}
    