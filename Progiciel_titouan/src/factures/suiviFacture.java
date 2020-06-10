package factures;

import java.util.Date;

public class suiviFacture extends facture {
	protected int numSuivi;
	protected boolean realisationFacture;
	protected boolean envoiFactureaOPCO;
	protected Date dateEnvoi;
	protected Date delaisMax; // 20 jours de plus que la date d'envvoi
	protected boolean retourOPCO;
	protected boolean envooiResteFacture;
	

}
