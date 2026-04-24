package tp5_java;

public class AbonnementMusique extends Abonnement implements Reducible {
	
	private int nbPlaylists;
	private boolean optionOffline;

	public AbonnementMusique(String nom, double prixBase, int nbProfils) {
		super(nom, prixBase, nbProfils);
	}
	
	public int getNbPlaylists() {
		return nbPlaylists;
	}

	public void setNbPlaylists(int nbPlaylists) {
		this.nbPlaylists = nbPlaylists;
	}

	public boolean isOptionOffline() {
		return optionOffline;
	}

	public void setOptionOffline(boolean optionOffline) {
		this.optionOffline = optionOffline;
	}

	@Override
	public double calculerCoutMensuel() {
		return getPrixBase()+(optionOffline?15:0);
	}

	@Override
	public int calculerScoreSatisfaction() {
		int score= 50+(nbPlaylists>20?20:0)+(optionOffline?20:0)+(getNbProfils()>1?10:0) ;
		return score>100?100:score;
	}

	@Override
	public double AppliquerReduction(double pourcentage) {
		return EstEligibleReduction(pourcentage)?calculerCoutMensuel()-(calculerCoutMensuel()*pourcentage/100):calculerCoutMensuel();
	}

	@Override
	public boolean EstEligibleReduction(double pourcentage) {
		return pourcentage>30?false:true;
	}
	
	
	
	
	

}
