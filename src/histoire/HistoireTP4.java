package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("prof", "boisson", 54);
//		prof.acheter("kombucha", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
//		
		Commercant Marco = new Commercant("Marco", "boisson", 15);
//		Marco.direBonjour();
//		Marco.seFaireExtorquer();
//		Marco.recevoire(15);
//		Marco.boire();
		
		Yakuza Yaku  = new Yakuza("Yaku", "whisky", "Warsong", 30);
		
		Yaku.direBonjour();
		Yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		Yaku.parler(" Marco, si tu tiens à la vie donne moi ta bourse !");
		Yaku.extorquer(Marco);
	}

}
