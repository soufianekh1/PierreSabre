package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	public Yakuza(String nom,String boisson,int argent,String clan) {
		
		super(nom, boisson, argent);
		this.clan=clan;
		
	}
	public void extorquer(Commercants victime) {
		
		argent+=victime.getArgent();
		parler("J'ai piqué les "+victime.seFaireExtorquer()+" sous de "+ victime.getNom()+ ", ce qui me fait "+argent+" sous dans ma poche. HI ! HI !");
		
	}

}
