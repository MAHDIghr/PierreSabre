package personnages;



public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPref, String clan, int argentQty) {
		super(nom, boissonPref, argentQty);
		this.clan = clan;
		this.reputation = reputation;
		reputation = 0 ;
	}
	
	
	public int getReputation() {
		return reputation;
	}


	public void extorquer(Commercant victime) {
		int argentPerdu = victime.seFaireExtorquer();
		argentQty += argentPerdu;
		reputation += 1;
		parler("j'ai piquee les "+ argentPerdu +" sous de " + victime.getNom() + " ce qui me fait " + argentQty + " dans ma poche \n hi hi ");
		
	}
	
	public int perdre() {
		int perte = argentQty;
		argentQty = 0;
		reputation -= 1;
		parler("J’ai perdu mon duel et mes" + perte +" sous, snif... J'ai déshonoré le clan "+ clan);
		return perte;
	}
	public void gagner(int  gain) {
		argentQty += gain;
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + nom +" du clan de "+ clan +
				" Je l'ai dépouillé de ses "+ gain + " sous");
	}
	
}
