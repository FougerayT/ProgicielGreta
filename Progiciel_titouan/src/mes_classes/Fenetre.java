package mes_classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Fenetre extends JFrame {
	
	  
	  private JComboBox combo = new JComboBox();
	  private JLabel label = new JLabel("Liste des OPCO");
	  
	  //numero siret 
	  private JFormattedTextField jtfSiret = new JFormattedTextField(NumberFormat.getIntegerInstance()); 
	  private JLabel labelSiret = new JLabel("Numero SIRET");
	  
	  
	  //nom
	  private JTextField jtfNom = new JTextField(""); 
	  private JLabel labelNom = new JLabel("Nom de l'enreprise");
	  
	  //IDCC 
	  //private JTextField jtfIDCC = new JTextField(""); // JTF classique sans probleme 
	  private JFormattedTextField jtfIDCC = new JFormattedTextField(NumberFormat.getIntegerInstance());
	  private JLabel labelIDCC = new JLabel("IDCC");
	  
	  //DateDeDebut
	  //private JTextField jtfDateDebut = new JTextField(""); // sans le format date sans probleme
	  private JFormattedTextField jtfDateDebut = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));; 
	  private JLabel labelDateDebut = new JLabel("Date de debut");
	  
	  //DateDeFin
	  private JFormattedTextField jtfDateFin = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));; 
	  private JLabel labelDateFin = new JLabel("Date de fin");

	  
	  //ajout des cases à cocher 
	  private JCheckBox check1 = new JCheckBox("Hebergement");
	  private JCheckBox check2 = new JCheckBox("Restauration");
	  private JCheckBox check3 = new JCheckBox("Premier Equiepements");
	  private JCheckBox check4 = new JCheckBox("Mobilités");
	  
	  //ajout du boutton valider 
	  private JButton boutonValider = new JButton("Valider");

	  

	 
	  
	  
	  public Fenetre(){
		  
		  // caracteristiques primaires 
    this.setTitle("Creation d'une entreprise");	    		//Définit un titre pour notre fenêtre
    this.setSize(600, 250);	    							//Définit sa taille : 400 pixels de large et 100 pixels de haut
    this.setLocationRelativeTo(null);	    				//Nous demandons maintenant à notre objet de se positionner au centre
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    //Termine le processus lorsqu'on clique sur la croix rouge
    setResizable(false);										//Empeche le redimensionnement 
    setAlwaysOnTop(false);										//garde touours la fenetre au premier plan 
    
    

    JOptionPane jop1, jop2, jop3;
    
  //Boîte du message d'information
    jop1 = new JOptionPane();
    jop1.showMessageDialog(null, "Message informatif", "Information", JOptionPane.INFORMATION_MESSAGE);
    		
    //Boîte du message préventif
    jop2 = new JOptionPane();
    jop2.showMessageDialog(null, "Message préventif", "Attention", JOptionPane.WARNING_MESSAGE);
    		
    //Boîte du message d'erreur
    jop3 = new JOptionPane();
    jop3.showMessageDialog(null, "Message d'erreur", "Erreur", JOptionPane.ERROR_MESSAGE);

    
    
    	//Remplissage de la liste de OPCO 
    String[] tab = new String[14];
    for(int i=0;i<14;i++)
    {
    	tab[i]=("OPCO "+ (i + 1));
    }
    
    combo = new JComboBox(tab);
    
    	//Ajout du listener
    combo.addItemListener(new ItemState());
    combo.addActionListener(new ItemAction());
    combo.setPreferredSize(new Dimension(300, 20));
    combo.setForeground(Color.blue);

    
		//Numero siret et recherche de l'existance d'une entreprise 
    Box top = Box.createHorizontalBox();
    jtfSiret.setToolTipText("numero de 15 chiffre"); // lorsqu'on laisse la souris dessus : donne des indications 
	top.add(labelSiret);
	top.add(jtfSiret);
	top.setMaximumSize(new Dimension(300, 20));
    
	
	//caracteristique d'une entreprise 
    Box l1 = Box.createHorizontalBox();
    l1.add (Box.createRigidArea (new Dimension (42,0)));
    l1.add(labelNom);
    l1.add(jtfNom);
    l1.add (Box.createRigidArea (new Dimension (50,0)));
	l1.add(labelIDCC);
    l1.add(jtfIDCC);    
    l1.add (Box.createRigidArea (new Dimension (42,0)));
	l1.setMaximumSize(new Dimension(600, 20));

    
    Box l2 = Box.createHorizontalBox();
    l2.add(labelDateDebut);
    l2.add(jtfDateDebut);
    l2.add (Box.createRigidArea (new Dimension (50,0)));  
    l2.add(labelDateFin);
    l2.add(jtfDateFin);  
	l2.setMaximumSize(new Dimension(500, 20));

    
    Box l3 = Box.createHorizontalBox();
    l3.add(label);
    l3.add(combo);
	l3.setMaximumSize(new Dimension(600, 20));


		//ajout des boutons au panel
    Box bot = Box.createHorizontalBox();
	bot.add(check1);
	bot.add(check2);
	bot.add(check3);
	bot.add(check4); 
	
	
	
    Box valider = Box.createHorizontalBox();
    valider.add(boutonValider);



    Font police = new Font("Arial", Font.BOLD, 14);
    jtfSiret.setFont(police);
    jtfSiret.setForeground(Color.BLUE);
    

    //On positionne maintenant ces trois lignes en colonne
    Box b4 = Box.createVerticalBox();
    b4.add(Box.createVerticalStrut(10));
    b4.add(top);
    b4.add(Box.createVerticalStrut(10));
    b4.add(l1);
    b4.add(Box.createVerticalStrut(10));
    b4.add(l2);
    b4.add(Box.createVerticalStrut(10));
    b4.add(l3); 
    b4.add(Box.createVerticalStrut(10));
    b4.add(bot);
    b4.add(Box.createVerticalStrut(10));
    b4.add(valider);

    




    



    
  
    
  
    

    	//listener sur les cases à cocher
    check1.addActionListener(new StateListener());
    check2.addActionListener(new StateListener());
    check3.addActionListener(new StateListener());
    check4.addActionListener(new StateListener());
    
    	//listener du bouton valider 
    boutonValider.addActionListener(new BoutonListener());



    


    this.setContentPane(b4);
    this.setVisible(true);  


  }
	  //Classe interne implémentant l'interface ItemListener
	  class ItemState implements ItemListener{
	    public void itemStateChanged(ItemEvent e) {
	      System.out.println("événement déclenché sur : " + e.getItem());
	    }               
	  }
	  
	  class ItemAction implements ActionListener{
		    public void actionPerformed(ActionEvent e) {
		      System.out.println("ActionListener : action sur " + combo.getSelectedItem());
		    }               
		  }
	  class StateListener implements ActionListener{
		    public void actionPerformed(ActionEvent e) {
		      System.out.println("source : " + ((JCheckBox)e.getSource()).getText() + " - état : " + ((JCheckBox)e.getSource()).isSelected());
		    }
		  }
	  class BoutonListener implements ActionListener{
		    public void actionPerformed(ActionEvent e) {
		    
			  System.out.println("Siret : " + jtfSiret.getValue());  
		      System.out.println("Nom : " + jtfNom.getText());
		      System.out.println("IDCC : " + jtfIDCC.getText());
		      System.out.println("DateDebut : " + jtfDateDebut.getText());		//a voir selon le format auquelle la rentrer 
		      System.out.println("DateFin : " + jtfDateFin.getText());		//a voir selon le format auquelle la rentrer 
		      

		     
		      
		    }
		  }

	  
}
