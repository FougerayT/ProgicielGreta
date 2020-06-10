package mes_classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame {
	
	  
	  private JPanel container = new JPanel();
	  private JComboBox combo = new JComboBox();
	  private JLabel label = new JLabel("Liste des OPCO");
	  
	  //numero siret 
	  private JTextField jtfSiret = new JTextField("Code de 15 chiffre"); 
	  private JLabel labelSiret = new JLabel("Numero SIRET");
	  
	  
	  //nom
	  private JTextField jtfNom = new JTextField(""); 
	  private JLabel labelNom = new JLabel("Nom de l'enreprise");
	  
	  //IDCC 
	  private JTextField jtfIDCC = new JTextField(""); 
	  private JLabel labelIDCC = new JLabel("IDCC");
	  
	  //DateDeDebut
	  private JTextField jtfDateDebut = new JTextField(""); 
	  private JLabel labelDateDebut = new JLabel("Date de debut");
	  
	  //DateDeFin
	  private JTextField jtfDateFin = new JTextField(""); 
	  private JLabel labelDateFin = new JLabel("Date de fin");

	  
	  //ajout des cases à cocher 
	  private JCheckBox check1 = new JCheckBox("Hebergement");
	  private JCheckBox check2 = new JCheckBox("Restauration");
	  private JCheckBox check3 = new JCheckBox("Premier Equiepements");
	  private JCheckBox check4 = new JCheckBox("Mobilités");

	 
	  
	  
	  public Fenetre(){
		  
		  // caracteristiques primaires 
    this.setTitle("Creation d'une entreprise");	    		//Définit un titre pour notre fenêtre
    this.setSize(500, 300);	    							//Définit sa taille : 400 pixels de large et 100 pixels de haut
    this.setLocationRelativeTo(null);	    				//Nous demandons maintenant à notre objet de se positionner au centre
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	    //Termine le processus lorsqu'on clique sur la croix rouge
    setResizable(true);										//Empeche le redimensionnement 
    setAlwaysOnTop(false);										//garde touours la fenetre au premier plan 
    
    

    	//conteneurs 
    container.setBackground(Color.white);
    //container.setLayout(new BorderLayout());
    container.setLayout(new GridLayout(5,2,10,10)); //utiliser une grille pour agencer les composants 
    //combo.setPreferredSize(new Dimension(200, 20));

    
    
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
    combo.setPreferredSize(new Dimension(100, 20));
    combo.setForeground(Color.blue);

    
		//Numero siret et recherche de l'existance d'une entreprise 
    Box top = Box.createHorizontalBox();
    //JPanel top = new JPanel();
    //top.setLayout(new BoxLayout(top, BoxLayout.LINE_AXIS));
	top.add(labelSiret);
	top.add(jtfSiret);
    
	
	//caracteristique d'une entreprise 
    Box l1 = Box.createHorizontalBox();
    //JPanel l1 = new JPanel();
    //l1.setLayout(new BoxLayout(l1, BoxLayout.LINE_AXIS));
    //l1.setPreferredSize(new Dimension(6,4));
    l1.add(labelNom);
    l1.add(jtfNom);
	l1.add(labelIDCC);
    l1.add(jtfIDCC);    
    
    Box l2 = Box.createHorizontalBox();
    //JPanel l2 = new JPanel();
    //l2.setLayout(new BoxLayout(l2, BoxLayout.LINE_AXIS));
    l2.add(labelDateDebut);
    l2.add(jtfDateDebut);
    l2.add(labelDateFin);
    l2.add(jtfDateFin);  
    
    Box l3 = Box.createHorizontalBox();
    //JPanel l3 = new JPanel();
    //l3.setLayout(new BoxLayout(l3, BoxLayout.LINE_AXIS));  
    l3.add(label);
    l3.add(combo);

		//ajout des boutons au panel
    JPanel bot = new JPanel();
	bot.add(check1);
	bot.add(check2);
	bot.add(check3);
	bot.add(check4); 

    Font police = new Font("Arial", Font.BOLD, 14);
    jtfSiret.setFont(police);
    //jtfSiret.setPreferredSize(new Dimension(150, 30));
    jtfSiret.setForeground(Color.BLUE);
    

    //JPanel b4 = new JPanel();
    //On positionne maintenant ces trois lignes en colonne
    //b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
    Box b4 = Box.createVerticalBox();
    b4.add(top);
    b4.add(l1);
    b4.add(l2);
    b4.add(l3);   
    b4.add(bot);


    



    
  
    
    this.setContentPane(container);
    
    	//position des differents conteneurs 
    container.add(top);
    container.add(l1);
    container.add(l2);
    container.add(l3);
    container.add(bot);

    	//listener sur les cases à cocher
    check1.addActionListener(new StateListener());
    check2.addActionListener(new StateListener());
    check3.addActionListener(new StateListener());
    check4.addActionListener(new StateListener());

    
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
    

	  
}
