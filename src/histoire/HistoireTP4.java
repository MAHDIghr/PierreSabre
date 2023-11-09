package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("prof", "boisson", 54);
//		prof.acheter("kombucha", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
		
		Commercant Marco = new Commercant("Marco", "boisson", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoire(15);
		Marco.boire();
	}

}
