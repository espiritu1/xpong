package xpong;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UnoVsUno extends JFrame {
	
	Panel panel ;
	JMenuBar menu;
	
	JMenu fileMenu ;
    JMenu editMenu ;
    JMenu helpMenu ;

    JMenuItem loadiItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;
    JMenuItem mas ;
	
	
	public UnoVsUno(String pong, int x,  int y,  int ancho,  int alto){
		super(pong);
		
		menu = new JMenuBar();
		this.setBounds(x,y,ancho, alto);
		this.setLayout(new BorderLayout());
		
		fileMenu = new JMenu("file");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("help");

        loadiItem = new  JMenuItem("load");
        saveItem = new  JMenuItem("save");
        exitItem = new  JMenuItem("exit");
        mas = new  JMenuItem("mas informacion...");
        
        GestionMenu gb = new GestionMenu(this);

		loadiItem.addActionListener(gb);
		exitItem.addActionListener(gb);
		mas.addActionListener(gb);

        menu.add(fileMenu);
        menu.add(editMenu);
        menu.add(helpMenu);
        helpMenu.add(mas);

		

        
        fileMenu.add(loadiItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

		
		
		panel = new Panel();
        this.add(panel,BorderLayout.CENTER);
		this.add(menu,BorderLayout.NORTH);
		this.setTitle("juego de pong 1 v 1");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}

