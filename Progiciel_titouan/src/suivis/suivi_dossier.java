package suivis;

public class suivi_dossier {
	protected boolean envoiConvention;
	protected boolean receptionCerfa;
	protected boolean dossierComplet;
	public boolean isEnvoiConvention() {
		return envoiConvention;
	}
	public void setEnvoiConvention(boolean envoiConvention) {
		this.envoiConvention = envoiConvention;
	}
	public boolean isReceptionCerfa() {
		return receptionCerfa;
	}
	public void setReceptionCerfa(boolean receptionCerfa) {
		this.receptionCerfa = receptionCerfa;
	}
	public boolean isDossierComplet() {
		return dossierComplet;
	}
	public void setDossierComplet(boolean dossierComplet) {
		this.dossierComplet = dossierComplet;
	}
	
	
	

}
