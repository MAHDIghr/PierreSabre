package personnages;

public class Ronin extends Humain {
	public Ronin(String nom, String boissonPref, int argentQty) {
		super(nom, boissonPref, argentQty);
	}

	public void donner(Commercant beneficiaire) {
		int benefit = argentQty / 10;
		argentQty -= benefit;
		parler(beneficiaire.getNom() + " prend ces " + benefit + " sous");
		beneficiaire.recevoire(benefit);
	}
}
