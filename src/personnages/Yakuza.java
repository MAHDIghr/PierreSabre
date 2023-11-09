package personnages;



public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPref, String clan, int argentQty) {
		super(nom, boissonPref, argentQty);
		this.clan = clan;
		this.reputation = reputation;
		reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		int argentPerdu = victime.seFaireExtorquer();
		argentQty += argentPerdu;
		reputation += 1;
		parler("j'ai piquee les "+ argentPerdu +" sous de " + victime.getNom() + " ce qui me fait " + argentQty + " dans ma poche \n hi hi ");
		
	}
}
