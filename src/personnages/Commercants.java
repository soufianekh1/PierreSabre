package personnages;

public class Commercants extends Humain{
	
	public Commercants(String nom,int argent) {
		super(nom,"thé",argent);
	}
	
	public int seFaireExtorquer() {
		int argentVole=argent;
		argent=0;
		parler("le monde est vraiment trop injuste");
		return argentVole;
	}

	public void recevoir(int argent) {
		this.argent+=argent;
		parler(argent+ "sous ! Je te remercie généreux donateur");
		

	}
}
