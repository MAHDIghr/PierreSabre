package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boissonPref, int argentQty) {
		super(nom, boissonPref, argentQty);
		honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		int benefit = argentQty / 10;
		argentQty -= benefit;
		parler(beneficiaire.getNom() + " prend ces " + benefit + " sous");
		beneficiaire.recevoire(benefit);
	}

	public void provoquer(Yakuza adversaire) {
		int forceRonin = 2 * honneur;
		if (forceRonin >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			argentQty += adversaire.perdre();

		} else {
			honneur -= 1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argentQty);
			argentQty = 0;

		}

	}
}
