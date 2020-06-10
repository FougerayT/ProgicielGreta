package mes_classes;

import java.util.Arrays;

public class fraisAnnexes extends opco {
	protected double hebergement;
	protected double restauration;
	protected double premiersEquipements;
	protected double mobilit�s;
	
	public fraisAnnexes()
	{
		super();
		hebergement = 0;
		restauration = 0;
		premiersEquipements = 0;
		mobilit�s = 0;
	}
	
	public fraisAnnexes(int siret, String nom, int IDCC, double coutOPCO, boolean fraisannexes,
			double hebergement, double restauration, double premiersEquipements, double mobilit�s)
	{
		super(siret,nom,IDCC,coutOPCO,fraisannexes);
		this.hebergement = hebergement;
		this.restauration = restauration;
		this.premiersEquipements = premiersEquipements;
		this.mobilit�s = mobilit�s;
	}

	public double getHebergement() {
		return hebergement;
	}

	public void setHebergement(double hebergement) {
		this.hebergement = hebergement;
	}

	public double getRestauration() {
		return restauration;
	}

	public void setRestauration(double restauration) {
		this.restauration = restauration;
	}

	public double getPremiersEquipements() {
		return premiersEquipements;
	}

	public void setPremiersEquipements(double premiersEquipements) {
		this.premiersEquipements = premiersEquipements;
	}

	public double getMobilit�s() {
		return mobilit�s;
	}

	public void setMobilit�s(double mobilit�s) {
		this.mobilit�s = mobilit�s;
	}

	@Override
	public String toString() {
		String str = "\n" + super.toString() + "\nfraisAnnexes [hebergement=" + hebergement + ", restauration=" + restauration + ", premiersEquipements="
				+ premiersEquipements + ", mobilit�s=" + mobilit�s + "]";
		return str;
	}


	

}
