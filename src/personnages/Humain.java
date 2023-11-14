package personnages;

public class Humain {
	protected String nom;
	protected String boissonPref;
	protected int argentQty;
	protected int nbConnaissance;
	protected Humain[] memoireHumain = new Humain[3];

	public Humain(String nom, String boissonPref, int argentQty) {

		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argentQty = argentQty;
		nbConnaissance = 0;
	}

	public String getNom() {
		return nom;
	}

	public float getArgentQty() {
		return argentQty;
	}

	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte + ".");

	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j’aime boire du " + boissonPref);
	}

	public void boire() {
		parler(" Mmmm, un bon verre de " + boissonPref + "! GLOUPS !");
	}

	public String acheter(String bien, int prix) {
		if (argentQty < prix) {
			parler("j'en ai que " + getArgentQty() + " sous en poche, je vais pas pouvoire m'offrir un " + bien + " a "
					+ prix);
			return "";
		} else {
			parler("J'ai " + getArgentQty() + " sous en poche je vais pouvoire m'offrir un " + bien + " a " + prix);
			perdreArgent(prix);
			return bien;
		}
	}

	public void gagnerArgent(int gain) {
		argentQty += gain;
	}

	public void perdreArgent(int perte) {
		argentQty -= perte;

	}
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memorise(autreHumain);
		autreHumain.memorise(this);
	}
	
	private void memorise(Humain humain) {
		memoireHumain[nbConnaissance] = humain;
		nbConnaissance += 1;
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			System.out.println(memoireHumain[i].nom);
		}
	}

}
