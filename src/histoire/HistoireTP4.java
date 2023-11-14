package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("prof", "boisson", 54);
//		prof.acheter("kombucha", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
//		
//		Commercant Marco = new Commercant("Marco", 15);
//		Marco.direBonjour();
//		Marco.seFaireExtorquer();
//		Marco.recevoire(15);
//		Marco.boire();

//		Yakuza Yaku  = new Yakuza("Yaku", "whisky", "Warsong", 30);
//		
//		Yaku.direBonjour();
//		Yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par lÃ  ?");
//		Yaku.parler(" Marco, si tu tiens Ã  la vie donne moi ta bourse !");
//		Yaku.extorquer(Marco);

//		Ronin Roro = new Ronin("Roro", "shochu", 60);
//		Roro.direBonjour();
//		Roro.donner(Marco);
		
		Ronin Roro = new Ronin("Roro", "the", 60);
		Yakuza YakuLeNoir = new Yakuza("Yaku le Noir", "the", "Warsong", 45);
		Roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n" + 
				"marchand!");
		
		Roro.provoquer(YakuLeNoir);
	}

}
