package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boissonPref, int argentQty) {
		super(nom, boissonPref, argentQty);
		boissonPref = "thé";
		
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argentQty;
		argentQty = 0;
		parler("j'ai perdu tout mon argent ! le monde est vraiment trop injuste !");
		return argentPerdu;
	}
	
	public void recevoire(int argent) {
		argentQty += argent; 
		parler(argent + " sous ! Je te remercie généreux donateur");
	}
}
