package xpong;

import javax.swing.*;
import java.awt.*;



public class Ventana extends JFrame  {
		
	Panel panel;
	//Panel2 panel2;

    JMenuBar menu;

    JMenu fileMenu ;
    JMenu editMenu ;
    JMenu helpMenu ;

    JMenuItem loadiItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;
    
    JMenuItem mas ;
	


	
	public Ventana(String pong, int x, int y, int ancho, int alto){
		super(pong);

		this.setBounds(x,y,ancho, alto);
	    this.setLayout(new BorderLayout());

		panel = new Panel();
	//	panel2 = new Panel2();
		///////////////////////////7
		menu = new JMenuBar();

        fileMenu = new JMenu("file");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("help");

        loadiItem = new  JMenuItem("load");
        saveItem = new  JMenuItem("save");
        exitItem = new  JMenuItem("exit");
        
        mas = new  JMenuItem("mas informacion...");
        

		

	
     
        
        fileMenu.add(loadiItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        helpMenu.add(mas);

        menu.add(fileMenu);
        menu.add(editMenu);
        menu.add(helpMenu);
	
		/////////////////////////////7
		
		
		
		
        this.add(menu ,BorderLayout.NORTH);
		this.add(panel ,BorderLayout.CENTER);
		
	//	this.add(panel2,BorderLayout.SOUTH); 
		
		/*this.add(b ,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH); 
*/
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);

	}
}