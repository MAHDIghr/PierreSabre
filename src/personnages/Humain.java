package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argentQty;

	public Humain(String nom, String boissonPref, int argentQty) {
		super();
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argentQty = argentQty;
	}

	public String getNom() {
		return nom;
	}

	public float getArgentQty() {
		return argentQty;
	}

	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - "+ texte +"."  );

	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + "et j’aime boire du " + boissonPref);
	}

	public void boire() {
		parler(" Mmmm, un bon verre de " + boissonPref + "! GLOUPS !");
	}

	public String acheter(String bien, int prix) {
		if (argentQty < prix) {
			parler("j'en ai que "+ getArgentQty() + " sous en poche, je vais pas pouvoire m'offrir un "+ bien + " a " + prix);
			return "";
		} else {
			parler("J'ai " + getArgentQty() + " sous en poche je vais pouvoire m'offrir un "+ bien +" a " + prix);
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

}
