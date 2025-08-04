package snakegame;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Gameframe extends JFrame {
	
     public static void Frame() {
    	 Gameframe gm = new Gameframe();
    	 Snakepanel gp = new Snakepanel();
    	 
    	 gm.setTitle("Snake Game");
    	 gm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 gm.setResizable(false);
    	 
    
    	 gm.add(gp);//add the panel to frame
    	 
    	 gm.setPreferredSize(new Dimension(Snakepanel.panelwidth,Snakepanel.panelheight)); 
    	 
    	 gm.pack();
    	 gm.setVisible(true);
         gm.setLocationRelativeTo(null);
         
           
         
    	 
     }
}
