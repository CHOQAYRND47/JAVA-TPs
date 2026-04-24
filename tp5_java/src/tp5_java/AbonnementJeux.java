package tp5_java;

public class AbonnementJeux extends Abonnement {
	
	private int nbJeuxInclus , heuresJeuParMois;

	public AbonnementJeux(String nom, double prixBase, int nbProfils) {
		super(nom, prixBase, nbProfils);		
	}
	
	public int getNbJeuxInclus() {
		return nbJeuxInclus;
	}

	public void setNbJeuxInclus(int nbJeuxInclus) {
		this.nbJeuxInclus = nbJeuxInclus;
	}

	public int getHeuresJeuParMois() {
		return heuresJeuParMois;
	}
	
	public void setHeuresJeuParMois(int heuresJeuParMois) {
		this.heuresJeuParMois = heuresJeuParMois;
	}	

	@Override
	public double calculerCoutMensuel() {
		return getPrixBase()+(nbJeuxInclus>50?25:0)+(heuresJeuParMois>40?15:0);
	}

	@Override
	public int calculerScoreSatisfaction() {
		int score = 40+(nbJeuxInclus>=30?20:0)+(heuresJeuParMois>=20?20:0)+(getNbProfils()>1?10:0);
		return score>100?100:score;
	}

}
