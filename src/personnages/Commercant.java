package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argentQty) {
		super(nom, nom, argentQty);
		boissonPref = "the";
		
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
