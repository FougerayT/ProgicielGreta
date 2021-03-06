package mes_classes;

import java.util.Arrays;

public class fraisAnnexes extends opco {
	protected double hebergement;
	protected double restauration;
	protected double premiersEquipements;
	protected double mobilitÚs;
	
	public fraisAnnexes()
	{
		super();
		hebergement = 0;
		restauration = 0;
		premiersEquipements = 0;
		mobilitÚs = 0;
	}
	
	public fraisAnnexes(int siret, String nom, int IDCC, double coutOPCO, boolean fraisannexes,
			double hebergement, double restauration, double premiersEquipements, double mobilitÚs)
	{
		super(siret,nom,IDCC,coutOPCO,fraisannexes);
		this.hebergement = hebergement;
		this.restauration = restauration;
		this.premiersEquipements = premiersEquipements;
		this.mobilitÚs = mobilitÚs;
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

	public double getMobilitÚs() {
		return mobilitÚs;
	}

	public void setMobilitÚs(double mobilitÚs) {
		this.mobilitÚs = mobilitÚs;
	}

	@Override
	public String toString() {
		String str = "\n" + super.toString() + "\nfraisAnnexes [hebergement=" + hebergement + ", restauration=" + restauration + ", premiersEquipements="
				+ premiersEquipements + ", mobilitÚs=" + mobilitÚs + "]";
		return str;
	}


	

}
