package mes_classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	  public void paintComponent(Graphics g){   
		    Font font = new Font("Courier", Font.BOLD, 20); 		//creation d'une nouvelle poice d'ecriture 
		    g.setFont(font);			// definir le fond de l'objet graphique "g" sur font 
		    g.setColor(Color.red); 		
		    g.drawString("Un premier affichage", 10, 20);
		  }  

}
