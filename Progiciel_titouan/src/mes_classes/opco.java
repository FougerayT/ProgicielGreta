package mes_classes;

public class opco extends entreprise {
	
	protected double coutOPCO;
	protected boolean fraisannexes;
	
	public opco()
	{
		super();
		coutOPCO = 0;
		fraisannexes = true;
	}

	public opco(int siret, String nom, int IDCC, double coutOPCO, boolean fraisannexes)
	{
		super(siret,nom,IDCC);
		this.coutOPCO = coutOPCO;
		this.fraisannexes = fraisannexes;
	}

	public double getCoutOPCO() {
		return coutOPCO;
	}

	public void setCoutOPCO(float coutOPCO) {
		this.coutOPCO = coutOPCO;
	}

	public boolean isFraisannexes() {
		return fraisannexes;
	}

	public void setFraisannexes(boolean fraisannexes) {
		this.fraisannexes = fraisannexes;
	}

	@Override
	public String toString() {
		String str =   "\n" + super.toString() + "\nopco [coutOPCO=" + coutOPCO + ", fraisannexes=" + fraisannexes + "]" ;
		return str;
	}
	
	

}
