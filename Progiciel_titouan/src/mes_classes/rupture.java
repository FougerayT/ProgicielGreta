package mes_classes;

import java.util.Date;

public class rupture {
	protected Date dateDeRupture;
	protected String infoRupture; 
	protected boolean lettreCFA;
	protected boolean lettreOPCO;
	
	
	
	
	
	public Date getDateDeRupture() {
		return dateDeRupture;
	}
	public void setDateDeRupture(Date dateDeRupture) {
		this.dateDeRupture = dateDeRupture;
	}
	public String getInfoRupture() {
		return infoRupture;
	}
	public void setInfoRupture(String infoRupture) {
		this.infoRupture = infoRupture;
	}
	public boolean isLettreCFA() {
		return lettreCFA;
	}
	public void setLettreCFA(boolean lettreCFA) {
		this.lettreCFA = lettreCFA;
	}
	public boolean isLettreOPCO() {
		return lettreOPCO;
	}
	public void setLettreOPCO(boolean lettreOPCO) {
		this.lettreOPCO = lettreOPCO;
	}

	

}
