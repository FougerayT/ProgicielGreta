package mes_classes;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

public class entreprise {
	
	protected int siret;
	protected String nom;
	protected int IDCC;
	protected int OPCO[]; //pas de type int mais de type OPCO 
	protected DateFormat datedebut;
	protected Date datefin;
	
	// constructeur 
	public entreprise()
	{
		System.out.println("Creation d'une entreprise !");
		siret =0000000000000;
		nom = "entrepriseSansParametre";
		IDCC =4745;
		/*
		//shortDateFormat
		DateFormat datedebut = DateFormat.getDateTimeInstance(
		        DateFormat.SHORT,
		        DateFormat.SHORT);
		*/
	}
	
	//constructeur avec des parametres 
	public entreprise(int psiret, String pnom, int pIDCC)
	{
		System.out.println("Creation d'une entreprise avec des parametre!");
		siret = psiret;
		nom = pnom;
		IDCC = pIDCC;
	}
	
	public int getSiret() {
		return siret;
	}
	public void setSiret(int siret) {
		this.siret = siret;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getIDCC() {
		return IDCC;
	}
	public void setIDCC(int iDCC) {
		IDCC = iDCC;
	}
	public int[] getOPCO() {
		return OPCO;
	}
	public void setOPCO(int[] oPCO) {
		OPCO = oPCO;
	}
	public DateFormat getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(DateFormat datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	
	public String toString() {
		return "\nentreprise [siret=" + siret + ", nom=" + nom + ", IDCC=" + IDCC + ", OPCO=" + Arrays.toString(OPCO)
				+ ", datedebut=" + datedebut + ", datefin=" + datefin + "]";
	}
	
	

}
