package histoire;

import personnages.Commercants;
import personnages.Humain;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof= new Humain("Prof","kambucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		//question 2-b
		Commercants marco= new Commercants("Marco",54);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

	}

}
